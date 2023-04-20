package com.test.base.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessRuntimeException extends RuntimeException{

    private Integer status = 400;

    public BusinessRuntimeException(String message) {
        super(message);
    }

    public BusinessRuntimeException(String message, Integer status) {
        super(message);
        this.status = status;
    }
}
