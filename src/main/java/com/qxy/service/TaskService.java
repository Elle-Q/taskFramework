package com.qxy.service;

import com.qxy.db.mapper.TaskInfoMapper;
import com.qxy.db.model.TaskInfo;
import com.qxy.db.model.TaskInfoExample;
import com.qxy.db.model.TaskInfoKey;
import com.qxy.db.querymapper.QueryTaskMapper;
import com.qxy.enums.TaskStage;
import com.qxy.model.Task;
import com.qxy.tool.DateUtil;
import com.qxy.tool.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * User: pretty el
 * Date: 2019/10/5
 */
@Service
public class TaskService {

    @Autowired
    private TaskInfoMapper taskInfoMapper;

    @Autowired
    private QueryTaskMapper queryTaskMapper;

    public int count(String taskName, String status) {
        TaskInfoExample exp = new TaskInfoExample();
        TaskInfoExample.Criteria criteria = exp.createCriteria().andTaskNameEqualTo(taskName);
        if (status != null)
            criteria.andStatusEqualTo(status);
        return this.taskInfoMapper.countByExample(exp);
    }

    /**
     * 列出所有
     *
     * @param taskName
     * @return
     */
    public List<Task> listByTaskName(String taskName) {
        return listOrderAsc(taskName, null, null);
    }

    /**
     * 列出所有
     *
     * @param taskName
     * @return
     */
    public List<Task> listByTaskNameAndStatus(String taskName, String taskStatus) {
        return listOrderAsc(taskName, taskStatus, null);
    }

    public List<Task> listOrderAsc(String taskName, String taskStatus, Integer fetchRows) {
        return listOrderAsc(taskName, taskStatus, fetchRows, "", "");
    }

    public List<Task> listOrderAsc(String taskName, String taskStatus, Integer fetchRows, String infoA, String infoB) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("taskName", taskName);
        if (!StringUtil.isBlank(taskStatus))
            map.put("taskStatus", taskStatus);
        if (!StringUtil.isBlank(infoA))
            map.put("infoA", infoA);
        if (!StringUtil.isBlank(infoB))
            map.put("infoB", infoB);
        if (fetchRows == null)
            map.put("fetchRows", 999999999);
        else
            map.put("fetchRows", fetchRows);
//    map.put("orderByStartDate", true); // fixme zm 暂时注释，数据太多，排序太慢
        List<Task> list = this.queryTaskMapper.list(map);
        return list;
    }


    public void insertIfNotExistStatusErro(String taskName, String infoId) {
        insertIfNotExist(taskName, infoId, Task.STATUS_ERROR);
    }

    public void insertIfNotExist(String taskName, String infoId, String status) {
        insertIfNotExist(taskName, infoId, status, null);
    }

    public void insertIfNotExist(String taskName, String infoId, String status, String site) {
        insertIfNotExist(taskName, infoId, status, site, null);
    }

    public void insertIfNotExist(String taskName, String infoId, String status, String site, TaskStage stage) {
        insertIfNotExist(taskName, infoId, status, site, stage, null);
    }

    public void insertIfNotExist(String taskName, String infoId, String status, String site, TaskStage stage, String infoA) {
        Task task = new Task(taskName, infoId);
        task.setStatus(status);
        task.setSite(site);
        task.setStage(stage == null ? null : stage.name());
        task.setInfoA(infoA);
        insertIfNotExist(task);
    }

    public void insertIfNotExist(Task task) {
        if (this.getById(task.getTaskName(), task.getInfoId()) == null) {
            this.taskInfoMapper.insert(task);
        }
    }

    public Task getById(String taskName, String infoId) {
        TaskInfoKey key = new TaskInfoKey();
        key.setTaskName(taskName);
        key.setInfoId(infoId);
        TaskInfo taskInfo = this.taskInfoMapper.selectByPrimaryKey(key);
        return taskInfo == null ? null : new Task(taskInfo);
    }

    public List<Task> getByIds(String taskName, List<String> ids) {
        TaskInfoExample exp = new TaskInfoExample();
        exp.createCriteria().andTaskNameEqualTo(taskName).andInfoIdIn(ids);
        List<TaskInfo> taskInfos = this.taskInfoMapper.selectByExample(exp);

        List<Task> tasks = new ArrayList<>();
        for (TaskInfo taskInfo : taskInfos) {
            tasks.add(new Task(taskInfo));
        }
        return  tasks;
    }

    public void insert(Task task) {
        task.setCreateTime(new Date());
        this.taskInfoMapper.insert(task);
    }

    public void updateSelective(Task task) {
        this.taskInfoMapper.updateByPrimaryKeySelective(task);
    }


    public void updateStatus(String taskName, String id, String status) {
        TaskInfo key = new TaskInfo();
        key.setTaskName(taskName);
        key.setInfoId(id);
        key.setStatus(status);
        this.taskInfoMapper.updateByPrimaryKeySelective(key);
    }

    public void updateStartDateCurrent(Task task) {
        task.setStartDate(DateUtil.getNowTimeDesc());
        task.setStatus(Task.STATUS_DOING);
        TaskInfo update = new TaskInfo();
        update.setTaskName(task.getTaskName());
        update.setInfoId(task.getInfoId());
        update.setStartDate(task.getStartDate());
        update.setStatus(task.getStatus());
        this.taskInfoMapper.updateByPrimaryKeySelective(update);
    }

    public void save(Task task) {
        TaskInfo info = this.taskInfoMapper.selectByPrimaryKey(task);
        if (info == null)
            this.insert(task);
        else
            update(task);
    }

    public void update(Task task) {
        this.taskInfoMapper.updateByPrimaryKey(task);
    }

    public void deleteByTaskName(String taskName) {
        TaskInfoExample exp = new TaskInfoExample();
        exp.createCriteria().andTaskNameEqualTo(taskName);
        this.taskInfoMapper.deleteByExample(exp);
    }

    public void deleteByKey(TaskInfoKey taskInfoKey) {
        this.taskInfoMapper.deleteByPrimaryKey(taskInfoKey);
    }


    public void deleteByKey(String taskName, String infoId) {
        TaskInfoKey key = new TaskInfoKey();
        key.setTaskName(taskName);
        key.setInfoId(infoId);
        this.taskInfoMapper.deleteByPrimaryKey(key);
    }

    public Task getTaskByPreemption(Map<String, Object> map) {
        return this.queryTaskMapper.getTaskByPreemption(map);
    }
    public String getTaskByPreemptionBatch(Map<String, Object> map) {
        return this.queryTaskMapper.getTaskByPreemptionBatch(map);
    }

}
