package com.qxy.service;

import com.qxy.db.mapper.ErrorLogMapper;
import com.qxy.db.model.ErrorLog;
import com.qxy.tool.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: pretty el
 * Date: 2019/10/5
 */
@Service
public class ErrorLogService {

    @Autowired
    private ErrorLogMapper errorLogMapper;

    public void insertErrorLog(ErrorLog errorLog) {
        this.errorLogMapper.insert(errorLog);
    }

    public void insertErrorLog(String taskName, String infoId, String logDev) {
        ErrorLog errorLog = new ErrorLog();
        errorLog.setTaskName(taskName);
        errorLog.setInfoId(infoId);
        errorLog.setLogDev(logDev);
        errorLog.setCurDate(DateUtil.getNowTimeDescMillisecond());
        this.insertErrorLog(errorLog);
    }
}
