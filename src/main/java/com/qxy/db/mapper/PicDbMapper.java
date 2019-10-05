package com.qxy.db.mapper;

import com.qxy.db.model.PicDb;
import com.qxy.db.model.PicDbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PicDbMapper {
    int countByExample(PicDbExample example);

    int deleteByExample(PicDbExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PicDb record);

    int insertSelective(PicDb record);

    List<PicDb> selectByExampleWithRowbounds(PicDbExample example, RowBounds rowBounds);

    List<PicDb> selectByExample(PicDbExample example);

    PicDb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PicDb record, @Param("example") PicDbExample example);

    int updateByExample(@Param("record") PicDb record, @Param("example") PicDbExample example);

    int updateByPrimaryKeySelective(PicDb record);

    int updateByPrimaryKey(PicDb record);
}