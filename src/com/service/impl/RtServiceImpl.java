package com.service.impl;

import com.dao.RtMapper;
import com.pojo.Rt;
import com.pojo.RtExample;
import com.service.RtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RtServiceImpl implements RtService {
    @Autowired
    private RtMapper rtMapper;

    @Override
    public int countByExample(RtExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(RtExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return rtMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Rt record) {
        return 0;
    }

    @Override
    public int insertSelective(Rt record) {
        return rtMapper.insertSelective(record);
    }

    @Override
    public List<Rt> selectByExample(RtExample example) {
        return null;
    }

    @Override
    public Rt selectByPrimaryKey(Integer id) {
        return rtMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Rt record, RtExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Rt record, RtExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Rt record) {
        return rtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Rt record) {
        return 0;
    }
}
