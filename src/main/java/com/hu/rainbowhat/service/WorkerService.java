package com.hu.rainbowhat.service;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.crypto.SecureUtil;
import com.hu.rainbowhat.common.ResultCode;
import com.hu.rainbowhat.entity.Worker;
import com.hu.rainbowhat.exception.CustomException;
import com.hu.rainbowhat.mapper.WorkerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 工人登陆相关service
 */
@Service
public class WorkerService {

    @Resource
    private WorkerMapper workerMapper;
    /*登陆*/
    public Worker login(String name,String password){
        //判断数据库里是否有该用户
        List<Worker> list = workerMapper.findByName(name);
        if (CollectionUtil.isEmpty(list)){
            throw new CustomException(ResultCode.USER_NOT_EXIST_ERROR);
        }
        //判断密码是否正确
        if (!SecureUtil.md5(password).equals(list.get(0).getPassword())){
            throw new CustomException(ResultCode.USER_NOT_EXIST_ERROR);
        }
        return list.get(0);
    }
}
