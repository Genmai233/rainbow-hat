package com.hu.rainbowhat.common;

import lombok.Data;

/**
 * 统一返回前端结果类
 */
public class Result<T> {
    /*返回码*/
    private  String code;
    /*返回中文信息*/
    private String msg;
    /*返回的对象类*/
    private T data;
    /*不带参数成功返回*/
    public static Result success(){
        Result result = new Result<>();
        result.setCode(ResultCode.SUCCSS.code);
        result.setMsg(ResultCode.SUCCSS.msg);
        return result;
    }
    /*带参数成功返回*/
    public static <T> Result<T> success(T data){
        Result<T> result = new Result<>(data);
        result.setCode(ResultCode.SUCCSS.code);
        result.setMsg(ResultCode.SUCCSS.msg);
        return result;
    }
    /*不带参数失败返回*/
    public static Result error(){
        Result result = new Result<>();
        result.setCode(ResultCode.ERROR.code);
        result.setMsg(ResultCode.ERROR.msg);
        return result;
    }
    /*带错误提示失败返回*/
    public static Result error(String code,String msg){
        Result result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public Result(T data) {
        this.data = data;
    }

    public Result() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
