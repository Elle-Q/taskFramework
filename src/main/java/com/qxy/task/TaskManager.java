package com.qxy.task;

import com.qxy.exception.TaskDbNoShowLogException;
import com.qxy.exception.TaskTerminateException;
import com.qxy.model.Task;
import com.qxy.service.ErrorLogService;
import com.qxy.service.TaskService;
import com.qxy.task.base.BaseManager;
import com.qxy.tool.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * User: pretty el
 * Date: 2019/10/5
 */
@Service
public abstract class TaskManager extends BaseManager {

    @Autowired
    private TaskService taskService;

    @Autowired
    private ErrorLogService errorLogService;

    //任务名称
    private String taskName;

    // 一次从数据库中加载的任务数量
    private int fetchTaskRows = 5000;

    private boolean isSaveError = false;

    // 是否随机打乱任务顺序
    private boolean isRandFetchTask = false;

    //任务状态
    private String taskStatus;

    // 是否把成功后的任务删除掉
    private boolean isDeleteSuccessTask = false;

    @Override
    public void start() {
        super.start();
    }

    /**
     * 抽象方法
     */
    protected abstract void execTaskDb(Task task) throws Exception;


    /**
     * 任务生产者
     * @return
     */
    @Override
    public List<Task> genTask() {
        LogCatalog.dbTaskManager.info("通过DB获取任务!开始！" + fetchTaskRows + "个");
        do {
            try {
                List<Task> list = this.taskService.listOrderAsc(taskName, taskStatus, fetchTaskRows);
                Collections.shuffle(list);
                LogCatalog.dbTaskManager.info("通过DB获取任务!完成！获得任务数量:" + list.size());
                return list;
            } catch (Exception e) {
                log.error("数据库获取任务失败,可能是数据库故障或网络故障，休息一分钟再次尝试");
                ThreadUtil.sleepSeccond(60);
                continue;
            }
        } while (true);
    }


    /**
     * 任务消费者
     * @return
     */
    @Override
    public void execTask(Task task) {
        // 设置开始执行
        this.taskService.updateStartDateCurrent(task);
        try {
            LogCatalog.dbTaskManager.debug("开始执行任务：" + BeanUtil.toString(task));
            execTaskDb(task);
        } catch (TaskTerminateException et) {
            LogCatalog.app.fatal("程序运行中抛出不可恢复异常！程序将终止运行！");
            LogCatalog.app.fatal(et, et);
            this.stop();
            return;
        } catch (Throwable e) {// 所有异常设置为状态ERROR，保留日志进数据库中
            LogCatalog.dbTaskManager.debug("异常执行任务：" + BeanUtil.toString(task));
            if (e instanceof TaskDbNoShowLogException == false) {
                LogCatalog.app.error("任务执行异常：" + BeanUtil.toString(task));
                LogCatalog.app.error(e, e);
            }
            task.setEndDate(DateUtil.getNowTimeDesc());
            task.setStatus(Task.STATUS_ERROR);
            task.setExecTime(new Date());
            long erroNum = task.getErroNum() == null ? 0 : task.getErroNum();
            erroNum++;
            task.setErroNum(erroNum);
            this.taskService.update(task);
            // 插入ERROR日志
            if (isSaveError) {
                LogCatalog.app.fatal("以下异常已存入ERROR_LOG表");
                errorLogService.insertErrorLog(task.getTaskName(), task.getInfoId(),
                        LogUtil.exceptionToString(e));
            }
            return;
        }
        LogCatalog.dbTaskManager.debug("完成执行任务：" + BeanUtil.toString(task));
        // 更新成功执行后的任务状态
        if (!isDeleteSuccessTask) {
            task.setEndDate(DateUtil.getNowTimeDesc());
            task.setStatus(Task.STATUS_SUCCESS);
            task.setExecTime(new Date());
            long succNum = task.getSuccNum() == null ? 0 : task.getSuccNum();
            succNum++;
            task.setSuccNum(succNum);
            this.taskService.update(task);
        }
        // 删除成功执行的任务
        else {
            this.taskService.deleteByKey(task.getTaskName(), task.getInfoId());
        }

    }

    public boolean isRandFetchTask() {
        return isRandFetchTask;
    }

    public void setRandFetchTask(boolean randFetchTask) {
        isRandFetchTask = randFetchTask;
    }

    public boolean isSaveError() {
        return isSaveError;
    }

    public void setSaveError(boolean isSaveError) {
        this.isSaveError = isSaveError;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setFetchTaskRows(int fetchTaskRows) {
        this.fetchTaskRows = fetchTaskRows;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
    public boolean isDeleteSuccessTask() {
        return isDeleteSuccessTask;
    }

    public void setDeleteSuccessTask(boolean isDeleteSuccessTask) {
        this.isDeleteSuccessTask = isDeleteSuccessTask;
    }

}

