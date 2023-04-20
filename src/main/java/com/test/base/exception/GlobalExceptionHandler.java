package com.test.base.exception;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.base.result.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = { BusinessRuntimeException.class})
    @ResponseBody
    public ErrorResponse businessRuntimeExceptionHandler(HttpServletResponse response, BusinessRuntimeException exception) {
        response.setStatus(exception.getStatus());
        return ErrorResponse.failure(exception.getMessage());
    }
}
