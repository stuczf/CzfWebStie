package com.chat_room.entity.common;

/**
 * @Author: 陈志峰
 * @Date: 2022/11/11 10:46
 * @Description: 服务器发送给浏览器的websocket数据
 */
public class ResultMessageWs {

    private boolean isSystem;   // 是否为系统数据，true为是，false为否
    private String sourceIds;   // 消息来源
    private Object message; // 如果是系统消息是数组

    public ResultMessageWs() {
    }

    public ResultMessageWs(boolean isSystem, Object message) {
        this.isSystem = isSystem;
        this.sourceIds = null;
        this.message = message;
    }

    public ResultMessageWs(boolean isSystem, String sourceIds, Object message) {
        this.isSystem = isSystem;
        this.sourceIds = sourceIds;
        this.message = message;
    }

    public boolean isSystem() {
        return isSystem;
    }

    public void setSystem(boolean system) {
        isSystem = system;
    }

    public String getSourceIds() {
        return sourceIds;
    }

    public void setSourceIds(String sourceIds) {
        this.sourceIds = sourceIds;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResultMessageWs{" +
                "isSystem=" + isSystem +
                ", sourceIds='" + sourceIds + '\'' +
                ", message=" + message +
                '}';
    }
}
