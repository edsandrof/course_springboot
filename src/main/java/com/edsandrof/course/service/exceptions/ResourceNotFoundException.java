package com.edsandrof.course.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 7554286642806425047L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id: " + id);
    }
}
