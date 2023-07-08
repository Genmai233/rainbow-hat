package com.hu.rainbowhat.common;

/**
 * 统一返回码
 */
public enum ResultCode {
    SUCCSS("0","成功"),
    ERROR("-1","系统异常"),
    PARAM_ERROR("1001","参数异常"),
    USER_EXIST_ERROR("2001","用户已存在"),
    USER_NOT_EXIST_ERROR("2003","未找到用户"),
    USER_ACCOUNT_ERROR("2002","账号或密码错误");





    public String code;
    public String msg;

    ResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
