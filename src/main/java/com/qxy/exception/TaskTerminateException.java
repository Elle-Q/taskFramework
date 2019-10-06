package com.qxy.exception;

/**
 * User: pretty el
 * Date: 2019/10/5
 */
public class TaskTerminateException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public TaskTerminateException(String msg){
        super(msg);
    }
}
