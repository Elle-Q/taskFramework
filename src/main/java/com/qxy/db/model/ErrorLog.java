package com.qxy.db.model;

public class ErrorLog {
    private String infoId;

    private String curDate;

    private String taskName;

    private String logDev;

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId == null ? null : infoId.trim();
    }

    public String getCurDate() {
        return curDate;
    }

    public void setCurDate(String curDate) {
        this.curDate = curDate == null ? null : curDate.trim();
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getLogDev() {
        return logDev;
    }

    public void setLogDev(String logDev) {
        this.logDev = logDev == null ? null : logDev.trim();
    }
}