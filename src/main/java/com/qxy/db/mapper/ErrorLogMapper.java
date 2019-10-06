package com.qxy.db.mapper;

import com.qxy.db.model.ErrorLog;
import com.qxy.db.model.ErrorLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ErrorLogMapper {
    int countByExample(ErrorLogExample example);

    int deleteByExample(ErrorLogExample example);

    int deleteByPrimaryKey(String infoId);

    int insert(ErrorLog record);

    int insertSelective(ErrorLog record);

    List<ErrorLog> selectByExampleWithRowbounds(ErrorLogExample example, RowBounds rowBounds);

    List<ErrorLog> selectByExample(ErrorLogExample example);

    ErrorLog selectByPrimaryKey(String infoId);

    int updateByExampleSelective(@Param("record") ErrorLog record, @Param("example") ErrorLogExample example);

    int updateByExample(@Param("record") ErrorLog record, @Param("example") ErrorLogExample example);

    int updateByPrimaryKeySelective(ErrorLog record);

    int updateByPrimaryKey(ErrorLog record);
}