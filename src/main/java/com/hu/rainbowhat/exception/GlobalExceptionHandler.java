package com.hu.rainbowhat.exception;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.hu.rainbowhat.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 控制器全局异常拦截
 */
@ControllerAdvice(basePackages = "com.hu.rainbowhat.controller")
public class GlobalExceptionHandler {

    /*统一异常处理，主要用于Exception*/
    private static final Log log = LogFactory.get();
    @ExceptionHandler(Exception.class)
    @ResponseBody //返回Jason字符串
    public Result erro(HttpServletRequest request,Exception e){
        log.error("异常信息",e);
        return Result.error();
    }

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public Result customError(HttpServletRequest request,CustomException e){
        log.error("异常信息",e.getMsg());
        return Result.error(e.getCode(),e.getMsg());
    }
}
