package com.qxy.db.model;

import java.util.Date;

public class TaskInfo extends TaskInfoKey {
    private String site;

    private String stage;

    private Long banch;

    private String status;

    private String startDate;

    private String endDate;

    private Long succNum;

    private Long erroNum;

    private String infoA;

    private String infoB;

    private String infoC;

    private String infoD;

    private String infoE;

    private Long infoInt1;

    private Long infoInt2;

    private String logInfo;

    private Date createTime;

    private Date execTime;

    private String infoF;

    private String infoG;

    private Integer priority;

    private String appSymbol;

    private Integer fileCnt;

    private Integer dirCnt;

    private Long fileSize;

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage == null ? null : stage.trim();
    }

    public Long getBanch() {
        return banch;
    }

    public void setBanch(Long banch) {
        this.banch = banch;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public Long getSuccNum() {
        return succNum;
    }

    public void setSuccNum(Long succNum) {
        this.succNum = succNum;
    }

    public Long getErroNum() {
        return erroNum;
    }

    public void setErroNum(Long erroNum) {
        this.erroNum = erroNum;
    }

    public String getInfoA() {
        return infoA;
    }

    public void setInfoA(String infoA) {
        this.infoA = infoA == null ? null : infoA.trim();
    }

    public String getInfoB() {
        return infoB;
    }

    public void setInfoB(String infoB) {
        this.infoB = infoB == null ? null : infoB.trim();
    }

    public String getInfoC() {
        return infoC;
    }

    public void setInfoC(String infoC) {
        this.infoC = infoC == null ? null : infoC.trim();
    }

    public String getInfoD() {
        return infoD;
    }

    public void setInfoD(String infoD) {
        this.infoD = infoD == null ? null : infoD.trim();
    }

    public String getInfoE() {
        return infoE;
    }

    public void setInfoE(String infoE) {
        this.infoE = infoE == null ? null : infoE.trim();
    }

    public Long getInfoInt1() {
        return infoInt1;
    }

    public void setInfoInt1(Long infoInt1) {
        this.infoInt1 = infoInt1;
    }

    public Long getInfoInt2() {
        return infoInt2;
    }

    public void setInfoInt2(Long infoInt2) {
        this.infoInt2 = infoInt2;
    }

    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo == null ? null : logInfo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getExecTime() {
        return execTime;
    }

    public void setExecTime(Date execTime) {
        this.execTime = execTime;
    }

    public String getInfoF() {
        return infoF;
    }

    public void setInfoF(String infoF) {
        this.infoF = infoF == null ? null : infoF.trim();
    }

    public String getInfoG() {
        return infoG;
    }

    public void setInfoG(String infoG) {
        this.infoG = infoG == null ? null : infoG.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getAppSymbol() {
        return appSymbol;
    }

    public void setAppSymbol(String appSymbol) {
        this.appSymbol = appSymbol == null ? null : appSymbol.trim();
    }

    public Integer getFileCnt() {
        return fileCnt;
    }

    public void setFileCnt(Integer fileCnt) {
        this.fileCnt = fileCnt;
    }

    public Integer getDirCnt() {
        return dirCnt;
    }

    public void setDirCnt(Integer dirCnt) {
        this.dirCnt = dirCnt;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }
}