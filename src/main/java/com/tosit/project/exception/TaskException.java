package com.tosit.project.exception;

/**
 * 任务异常类
 * <p>
 * Created by Bobo on 2017/3/11.
 * Copyright © Bobo SCU. All Rights Reserved
 */
public class TaskException extends Exception {
    /**
     * Constructs an TaskException with nothing.
     */
    public TaskException() {
        super();
    }

    /**
     * Constructs an TaskException with the specified detail message.
     *
     * @param message
     */
    public TaskException(String message) {
        super(message);
    }

    /**
     * Constructs an TaskException with the specified detail message and cause.
     *
     * @param message
     * @param cause
     */
    public TaskException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs an TaskException with the specified cause
     *
     * @param cause
     */
    public TaskException(Throwable cause) {
        super(cause);
    }

}
