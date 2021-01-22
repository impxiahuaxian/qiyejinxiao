package com.service.impl;

import com.dao.GyMapper;
import com.pojo.Gy;
import com.pojo.GyExample;
import com.service.GyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GyServiceImpl implements GyService {
    @Autowired
    private GyMapper gyMapper;
    @Override
    public int countByExample(GyExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(GyExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return gyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Gy record) {
        return 0;
    }

    @Override
    public int insertSelective(Gy record) {
        return gyMapper.insertSelective(record);
    }

    @Override
    public List<Gy> selectByExample(GyExample example) {
        return null;
    }

    @Override
    public Gy selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Gy record, GyExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Gy record, GyExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Gy record) {
        return gyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Gy record) {
        return 0;
    }

    @Override
    public String getSame(String mc) {
        return gyMapper.getSame(mc);
    }

    @Override
    public String upgetSame(Gy record) {
        return gyMapper.upgetSame(record);
    }
}
