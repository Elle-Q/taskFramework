package com.qxy.tool;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: pretty el
 * Date: 2019/10/5
 */
public class SpringBeanUtil {
    public static ClassPathXmlApplicationContext getBeanFactoryWithLocal() {
        String[] locations = {"classpath:spring*.xml" };
        ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext(locations);
        return beanFactory;
    }

    public static ClassPathXmlApplicationContext getBeanFactoryWithLocalSprider() {
        String[] locations = {"classpath:spring*.xml"};
        ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext(locations);
        return beanFactory;
    }

    public static ClassPathXmlApplicationContext getBeanFactory() {
        String[] locations = {"classpath:spring*.xml"};
        ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext(locations);
        return beanFactory;
    }
}
