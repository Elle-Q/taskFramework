package com.qxy.service;

import com.qxy.db.mapper.PicDbMapper;
import com.qxy.db.model.PicDb;
import com.qxy.db.model.PicDbExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 圖片表的增刪查改
 * User: pretty el
 * Date: 2019/8/13
 */
@Service
public class PicService {

    @Autowired
    PicDbMapper picDbMapper;

    public List<PicDb> page(Integer pageIndex, Integer pageSize) {
        PicDbExample picDbExample = new PicDbExample();
        PicDbExample.Criteria criteria = picDbExample.createCriteria();
        RowBounds rowBounds = new RowBounds(pageIndex,pageSize);
        List<PicDb> pics = picDbMapper.selectByExampleWithRowbounds(picDbExample,rowBounds);
        return pics;
    }

}
