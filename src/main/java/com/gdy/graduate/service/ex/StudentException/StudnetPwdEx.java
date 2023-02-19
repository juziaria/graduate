package com.gdy.graduate.service.ex.StudentException;

import com.gdy.graduate.service.ex.ServiceException;

public class StudnetPwdEx extends ServiceException {
    public StudnetPwdEx() {
        super();
    }

    public StudnetPwdEx(String message) {
        super(message);
    }

    public StudnetPwdEx(String message, Throwable cause) {
        super(message, cause);
    }

    public StudnetPwdEx(Throwable cause) {
        super(cause);
    }

    protected StudnetPwdEx(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
