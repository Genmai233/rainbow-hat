package com.hu.rainbowhat.config;

import com.hu.rainbowhat.common.Common;
import com.hu.rainbowhat.entity.Worker;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 如果没有登陆，重定向到登陆页
 */
public class MyInterceptor implements HandlerInterceptor {
    /**
     * 所有访问后台乞求先要从这里路过
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Worker worker = (Worker) request.getSession().getAttribute(Common.Worker);
        if(worker==null){
            //重定向登录页
            response.sendRedirect("/end/page/login.html");
            return false;
        }
        return true;
    }

}
