package com.edsandrof.course.service.exceptions;

public class DatabaseException extends RuntimeException {
    private static final long serialVersionUID = 4625101231119810281L;

    public DatabaseException(String msg) {
        super(msg);
    }
}
