package com.chat_room.constant;

/**
 * @Author: 陈志峰
 * @Date: 2022/11/11 10:01
 * @Description: 用于接口返回的编码和信息
 */
public class JsonMsgModelConstants {

    public static final String SUCCESS = "00"; // 请求成功
    public static final String FAILE = "01"; // 请求失败
    public static final String noExistAccount = "02";// 账号不存在
    public static final String errPwd = "03";// 密码错误
    public static final String noMethodType = "04";// 没有方法类型
    public static final String noMethodName = "05";// 没有方法名
    public static final String noJsonType = "06";// 没有json类型参数
    public static final String paramIsErr = "07";// 参数格式不对
    public static final String paramIsNull = "08";// 查询参数为空
    public static final String objIsNull = "09";// 查询结果为空
    public static final String noToken = "10";// token过期
    public static final String undefindErr = "-01";// 未知错误

    public static String getMsg(String msgNo) {
        System.err.println();
        String msg = "未知错误，请联系管理员！";
        if (msgNo.equals(SUCCESS)) {
            msg = "请求成功！";
        } else if (msgNo.equals(FAILE)) {
            msg = "请求失败！";
        } else if (msgNo.equals(noExistAccount)) {
            msg = "该帐号不存在系统中，请核实！";
        } else if (msgNo.equals(errPwd)) {
            msg = "密码错误，请核实！";
        } else if (msgNo.equals(noMethodType)) {
            msg = "请传入接口类型！";
        } else if (msgNo.equals(noMethodName)) {
            msg = "请传入接口名称！";
        } else if (msgNo.equals(noJsonType)) {
            msg = "查询参数有误，params接收json类型字符串！";
        } else if (msgNo.equals(paramIsErr)) {
            msg = "传入的参数格式或者数值有误，请核实！";
        }else if (msgNo.equals(paramIsNull)) {
            msg = "请求参数不能为空！";
        }else if (msgNo.equals(objIsNull)) {
            msg = "查询结果为空！";
        }else if (msgNo.equals(noToken)) {
            msg = "会话已过期，请重新登录！";
        }
        return msg;
    }
}
