package com.qxy.tool;

import java.util.List;

/**
 * User: pretty el
 * Date: 2019/10/5
 */
public class ThreadUtil {
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sleepSeccond(int seccond) {
        try {
            Thread.sleep(seccond*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 把所有的thread join起来变成阻塞的模式，即，所有的thread执行完成后主线程才继续
     * @param threadList
     */
    public static void block(List<Thread> threadList){
        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void waitThis() {
        try {
            Thread.currentThread().wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
