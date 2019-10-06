package com.qxy.db.querymapper;

import com.qxy.model.Task;

import java.util.List;
import java.util.Map;

/**
 * User: pretty el
 * Date: 2019/10/5
 */
public interface QueryTaskMapper {
    List<Task> list(Map<String, Object> map);
    Task getTaskByPreemption(Map<String, Object> map);
    String getTaskByPreemptionBatch(Map<String, Object> map);
}
