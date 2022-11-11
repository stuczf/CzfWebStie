package com.chat_room.entity.common;

/**
 * @Author: 陈志峰
 * @Date: 2022/11/1 10:23
 * @Description: 统一模型
 */

public class CommonResult<T> {
    private String code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(String code, String message) {
        this(code, message, null);
    }

    public CommonResult(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
