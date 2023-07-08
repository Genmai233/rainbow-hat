package com.hu.rainbowhat.mapper;

import com.hu.rainbowhat.entity.NxSysFile;
import com.hu.rainbowhat.entity.Worker;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文件相关的mapper
 */
@Repository
public interface NxSysFileMapper extends Mapper<NxSysFile> {

    List<NxSysFile> findByName(@Param("name") String name);
}