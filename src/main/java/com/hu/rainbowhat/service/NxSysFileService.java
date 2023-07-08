package com.hu.rainbowhat.service;

import com.hu.rainbowhat.entity.NxSysFile;
import com.hu.rainbowhat.mapper.NxSysFileMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NxSysFileService {

    @Resource
    private NxSysFileMapper nxSysFileMapper;
    /**
     * 新增文件
     */
    public NxSysFile add(NxSysFile nxSysFile){
        nxSysFileMapper.insertSelective(nxSysFile);
        return nxSysFile;
    }
    /**
     * 修改文件
     */
    public void update(NxSysFile nxSysFile){
        nxSysFileMapper.updateByPrimaryKeySelective(nxSysFile);
    }
    /**
     * 根据id删除文件
     */
    public void delete(Long id){
        nxSysFileMapper.deleteByPrimaryKey(id);
    }
    /**
     * 根据id获取文件
     */
    public NxSysFile findById(Long id){
        return nxSysFileMapper.selectByPrimaryKey(id);
    }
}
