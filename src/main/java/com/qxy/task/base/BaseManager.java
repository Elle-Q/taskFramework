package com.qxy.task.base;

import com.qxy.model.Task;
import com.qxy.task.TaskList;
import com.qxy.tool.ThreadUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * User: pretty el
 * Date: 2019/10/5
 */
public abstract class BaseManager{

    public static Log log = LogFactory.getLog(BaseManager.class);

    //生产者
    public abstract List<Task> genTask();

    //消费者
    public abstract void execTask(Task taskInfo);

    //设置执行任务线程数
    private int threadNum = 1;// 默认为1

    //设置每次任务之间间隔,单位，秒
    private int sleep = 0;

    //设置执行次数，每个线程执行这么多次以后就终止
    private int execNum = 0;

    //设置每一组执行多少次
    private int groupExecNum = 0;

    //设置组之间的间隔,以秒为单位
    private int groupSleep = 0;

    private boolean isStop = false;

    private int loadbalanceNum = -1;

    private int mod = -1;

    private boolean isStarted = false;

    private boolean isShowEasyLog = false;//是否显示简单日志

    private boolean ifNoTaskStop = true;//如果没有任务了就退出

    private boolean isNoTask = false;//是否已经没有任务了

    private int delayStart = 1;// 每个线程之间启动间隔时间(默认1秒)

    private TaskList taskList = new TaskList();

    private List<ExecTaskThread> execTaskThreadList;

    public void start() {
        taskList.addAll(genTask());
        GenTaskThread genTaskThread = new GenTaskThread();
        genTaskThread.start();
        this.execTaskThreadList = new ArrayList<>();
        for (int i = 0; i < this.threadNum; i++) {
            execTaskThreadList.add(new ExecTaskThread());
        }
        for (ExecTaskThread execTaskThread : execTaskThreadList) {
            execTaskThread.start();
            this.isStarted = true;
            ThreadUtil.sleep(delayStart * 1000);
        }
    }


    class GenTaskThread extends Thread {
        @Override
        public void run() {
            while (!isStop) {
                if (isShowEasyLog) {
                    BaseManager.log.info("当前任务队列:" + taskList.size());
                }
                if (taskList.isEmpty() && !isNoTask) {
                    List<Task> genTaskList = genTask();
                    if ((genTaskList == null || genTaskList.size() == 0) && ifNoTaskStop) {
                        BaseManager.log.info("任务获取队列长度为0!");
                        isNoTask = true;//设置没有任务了的状态
                    } else {
                        BaseManager.log.info("获取新的任务队列：" + genTaskList.size());
                        taskList.addAll(genTaskList);
                    }
                    ThreadUtil.sleepSeccond(10);
                }
                //判断消费者是否全部退出，如果全部退出则设置isStop=true，发出结束标识
                ThreadUtil.sleepSeccond(5);
                // 判断线程状态，如果任务执行者全部退出，则生产者退出
                boolean allTerminated = true;
                for (ExecTaskThread execTaskThread : execTaskThreadList) {
                    if (!State.TERMINATED.equals(execTaskThread.getState())) {
                        allTerminated = false;
                        break;
                    }
                }
                if (allTerminated && ifNoTaskStop) {
                    BaseManager.log.info("任务执行者全部退出，生产者退出!" + " - " + " 任务结束!");
                    isStop = true;
                }
                continue;
            }
            BaseManager.log.info("任务生产者线程退出!");
        }
    }

    class ExecTaskThread extends Thread {

        private int curExecNum = 0;

        private int curGroupExecNum = 0;

        @Override
        public void run() {
            //接受到停止标识，或者没有任务了，都退出
            while (!isStop && !isNoTask) {
                Task taskInfo = taskList.poll();
                if (taskInfo != null) {
                    // 取模负载处理
                    if (taskInfo.getInfoInt1() != null && getMod() != -1 && getLoadbalanceNum() != -1) {
                        if (taskInfo.getInfoInt1() % getLoadbalanceNum() != getMod()) {
                            continue;
                        }
                    }
                    execTask(taskInfo);
                    this.curExecNum++;
                    this.curGroupExecNum++;
                    if (execNum > 0 && curExecNum >= execNum) {
                        break;
                    }
                    if (groupExecNum > 0 && groupSleep > 0 && this.curGroupExecNum >= groupExecNum) {
                        ThreadUtil.sleep(groupSleep * 1000);
                        this.curGroupExecNum = 0;
                    }
                    if (sleep > 0) {
                        ThreadUtil.sleep(sleep * 1000);
                    }
                } else {
                    try {
                        Thread.yield();
                        Thread.sleep(1000 * 10);
                    } catch (InterruptedException e) {
                        log.error(e, e);
                    }
                    continue;
                }
            }
            BaseManager.log.info("任务执行者线程:" + Thread.currentThread().getName() + " - 退出！");
        }
    }

    public void setThreadNum(int threadNum) {
        this.threadNum = threadNum;
    }

    public int getThreadNum() {
        return this.threadNum;
    }
    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public void setExecNum(int execNum) {
        this.execNum = execNum;
    }
    public void setGroupExecNum(int groupExecNum) {
        this.groupExecNum = groupExecNum;
    }

    public void setGroupSleep(int groupSleep) {
        this.groupSleep = groupSleep;
    }
    public boolean isShowEasyLog() {
        return isShowEasyLog;
    }

    public void setShowEasyLog(boolean showEasyLog) {
        isShowEasyLog = showEasyLog;
    }

    public boolean isIfNoTaskStop() {
        return ifNoTaskStop;
    }

    public void setIfNoTaskStop(boolean ifNoTaskStop) {
        this.ifNoTaskStop = ifNoTaskStop;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    public void stop() {
        this.isStop = true;
    }
    public void setDelayStart(int delayStart) {
        this.delayStart = delayStart;
    }
    public TaskList getTaskList() {
        return taskList;
    }

    public int getLoadbalanceNum() {
        return loadbalanceNum;
    }

    public void setLoadbalanceNum(int loadbalanceNum) {
        this.loadbalanceNum = loadbalanceNum;
    }

    public int getMod() {
        return mod;
    }

    public void setMod(int mod) {
        this.mod = mod;
    }
}
