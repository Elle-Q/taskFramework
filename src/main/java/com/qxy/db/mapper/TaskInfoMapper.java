package com.qxy.db.mapper;

import com.qxy.db.model.TaskInfo;
import com.qxy.db.model.TaskInfoExample;
import com.qxy.db.model.TaskInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TaskInfoMapper {
    int countByExample(TaskInfoExample example);

    int deleteByExample(TaskInfoExample example);

    int deleteByPrimaryKey(TaskInfoKey key);

    int insert(TaskInfo record);

    int insertSelective(TaskInfo record);

    List<TaskInfo> selectByExampleWithRowbounds(TaskInfoExample example, RowBounds rowBounds);

    List<TaskInfo> selectByExample(TaskInfoExample example);

    TaskInfo selectByPrimaryKey(TaskInfoKey key);

    int updateByExampleSelective(@Param("record") TaskInfo record, @Param("example") TaskInfoExample example);

    int updateByExample(@Param("record") TaskInfo record, @Param("example") TaskInfoExample example);

    int updateByPrimaryKeySelective(TaskInfo record);

    int updateByPrimaryKey(TaskInfo record);
}