package com.test.base.result;

public class SuccessResponse<T> extends BaseResponse {

    private T data;

    private SuccessResponse(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> SuccessResponse<T> success(T data) {
        return new SuccessResponse<T>(data);
    }
}
