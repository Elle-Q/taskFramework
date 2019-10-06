package com.qxy.task;

import com.qxy.model.Task;

import java.util.LinkedList;
import java.util.List;

/**
 * User: pretty el
 * Date: 2019/10/5
 */
public class TaskList {
    private LinkedList<Task> list = new LinkedList<Task>();

    /**
     * // 添加第一个url，到队列尾
     */
    public synchronized void add(Task task) {
        this.list.add(task);
    }

    /**
     * // 返回队列头第一个taskInfo，并从队列移除它
     */
    public synchronized Task poll() {
        return this.list.poll();
    }

    public synchronized void addAll(List<Task> list) {
        this.list.addAll(list);
    }

    public synchronized boolean isEmpty() {
        return this.list.isEmpty();
    }

    public synchronized int size() {
        return this.list.size();
    }
}

