package com.qxy.mains;

import com.qxy.model.Task;
import com.qxy.task.TaskManager;
import com.qxy.tool.SpringBeanUtil;
import org.springframework.stereotype.Service;

/**
 * User: pretty el
 * Date: 2019/10/5
 */
@Service
public class TaskTest_qxy extends TaskManager {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
//         BeanFactory factory = (BeanFactory) context;
//        TaskTest_qxy manager = (TaskTest_qxy) factory.getBean("taskTest_qxy");
        TaskTest_qxy manager = SpringBeanUtil.getBeanFactoryWithLocalSprider().getBean(TaskTest_qxy.class);
        manager.setTaskName("test_001");
        manager.setThreadNum(1);
        manager.setSleep(1);
        manager.setTaskStatus(Task.STATUS_NEW);
        manager.setDeleteSuccessTask(false);
        manager.start();
    }

    @Override
    protected void execTaskDb(Task task) throws Exception {
        System.out.println(task.getInfoId());
    }
}
