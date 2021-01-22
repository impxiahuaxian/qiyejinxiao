package com.service.impl;

import com.dao.CpMapper;
import com.pojo.Cp;
import com.pojo.CpExample;
import com.service.CpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CpServiceImpl implements CpService {
    @Autowired
    private CpMapper cpMapper;
    @Override
    public int countByExample(CpExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(CpExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cpMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Cp record) {
        return 0;
    }

    @Override
    public int insertSelective(Cp record) {
        return cpMapper.insertSelective(record);
    }

    @Override
    public List<Cp> selectByExample(CpExample example) {
        return null;
    }

    @Override
    public Cp selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Cp record, CpExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Cp record, CpExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Cp record) {
        return cpMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Cp record) {
        return 0;
    }

    @Override
    public String getSame(String mc) {
        return cpMapper.getSame(mc);
    }

    @Override
    public String upgetSame(Cp record) {
        return cpMapper.upgetSame(record);
    }
}
