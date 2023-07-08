package com.hu.rainbowhat.controller;

import cn.hutool.core.util.StrUtil;
import com.hu.rainbowhat.common.Common;
import com.hu.rainbowhat.common.Result;
import com.hu.rainbowhat.common.ResultCode;
import com.hu.rainbowhat.entity.Worker;
import com.hu.rainbowhat.exception.CustomException;
import com.hu.rainbowhat.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 登陆，退出相关的控制器
 */
@RestController
public class AccountController {
    @Resource
    private WorkerService workerService;
    /**
     * 登陆
     */
    @PostMapping("/login")
    public Result<Worker> login(@RequestBody Worker worker, HttpServletRequest request){
        if(StrUtil.isBlank(worker.getName())||StrUtil.isBlank(worker.getPassword())){
            throw new CustomException(ResultCode.USER_ACCOUNT_ERROR);
        }

        //从数据库查询账号密码是否正确,放到session
        Worker login = workerService.login(worker.getName(),worker.getPassword());
        HttpSession session = request.getSession();
        session.setAttribute(Common.Worker,login);
        session.setMaxInactiveInterval(60*24);
        return  Result.success(login);
    }
    /**
     * 登出
     */
    @GetMapping("/logout")
    public Result logout(HttpServletRequest request){
        request.getSession().setAttribute(Common.Worker,null);
        return Result.success();
    }
}
