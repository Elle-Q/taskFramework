package com.qxy.model;

import com.qxy.db.model.TaskInfo;
import com.qxy.enums.TaskStage;
import com.qxy.tool.BeanUtil;

import java.util.Date;

/**
 * User: pretty el
 * Date: 2019/10/5
 */
public class Task extends TaskInfo {
    public static final String STATUS_NEW = "NEW";
    public static final String STATUS_SUCCESS = "SUCC";
    public static final String STATUS_ERROR = "ERRO";
    public static final String STATUS_DOING = "ING";

    public Task() {
        this.setErroNum(0l);
        this.setSuccNum(0l);
    }

    public Task(TaskInfo taskInfo) {
        BeanUtil.copyProperties(this, taskInfo);
    }

    public Task(String taskName) {
        this(taskName, null);
    }

    public Task(String taskName, String infoId) {
        this(taskName, infoId, null);
    }

    public Task(String taskName, String infoId, String status) {
        this(taskName, infoId, status, null);
    }

    public Task(String taskName, String infoId, String status, String infoA) {
        this(taskName, infoId, status, infoA, null);
    }

    public Task(String taskName, String infoId, String status, String infoA, String infoB) {
        this.setTaskName(taskName);
        this.setInfoId(infoId);
        this.setStatus(status);
        this.setInfoA(infoA);
        this.setInfoB(infoB);
        this.setCreateTime(new Date());
    }

    public TaskStage getStageObj() {
        if (this.getStage() == null)
            return null;
        return TaskStage.valueOf(this.getStage());
    }

    public void setStageObj(TaskStage taskStage) {
        this.setStage(taskStage == null ? null : taskStage.name());
    }
}

