package com.test.base.result;

public class ErrorResponse extends BaseResponse{

    private String message;

    private ErrorResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static ErrorResponse failure(String message) {
        return new ErrorResponse(message);
    }
}
