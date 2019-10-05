package com.qxy.model;

import com.qxy.db.model.PicDb;
import org.springframework.beans.BeanUtils;

/**
 * User: pretty el
 * Date: 2019/8/13
 */
public class Pic extends PicDb {

    public Pic() {
    }

    public Pic Pic(PicDb picDb) {
        Pic pic = new Pic();
        BeanUtils.copyProperties(pic,picDb);
        return pic;
    }
}
