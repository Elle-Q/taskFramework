package com.qxy.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * User: pretty el
 * Date: 2019/9/8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
        "classpath:spring-mybatis.xml" })
public class PicServiceTest {

    @Autowired
    private PicService picService;

    @Test
    public void page() {
//        PicService picService = new PicService();
        List<PicDb> picDbs = picService.page(1, 1);
        Assert.assertNotNull(picDbs);
    }
}
