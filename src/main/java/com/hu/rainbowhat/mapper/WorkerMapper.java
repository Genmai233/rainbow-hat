package com.hu.rainbowhat.mapper;

import com.hu.rainbowhat.entity.Worker;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface WorkerMapper extends BaseMapper<Worker> {

    List<Worker> findByName(@Param("name") String name);
}