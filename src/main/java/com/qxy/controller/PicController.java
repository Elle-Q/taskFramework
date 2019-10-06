package com.qxy.controller;

import com.qxy.db.model.PicDb;
import com.qxy.mains.TaskTest_qxy;
import com.qxy.model.Task;
import com.qxy.service.PicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * User: pretty el
 * Date: 2019/8/13
 */
@RequestMapping("/pic")
@Controller
public class PicController {
    @Autowired
    PicService picService;

    @Autowired
    TaskTest_qxy manager;

    @RequestMapping("/page")
    @ResponseBody
    public String page(@RequestParam Integer pageIndex, @RequestParam Integer pageSize) {
        List<PicDb> picDbs = picService.page(pageIndex,pageSize);
        manager.setTaskName("test_001");
        manager.setThreadNum(1);
        manager.setSleep(1);
        manager.setTaskStatus(Task.STATUS_NEW);
        manager.setDeleteSuccessTask(false);
        manager.start();
        return "index";
    }
}
