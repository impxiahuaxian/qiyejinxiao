package com.service.impl;

import com.dao.FlMapper;
import com.pojo.Fl;
import com.pojo.FlExample;
import com.service.FlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlServiceImpl implements FlService {
    @Autowired
    private FlMapper flMapper;
    @Override
    public int countByExample(FlExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(FlExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return flMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Fl record) {
        return 0;
    }

    @Override
    public int insertSelective(Fl record) {
        return flMapper.insertSelective(record);
    }

    @Override
    public List<Fl> selectByExample(FlExample example) {
        return null;
    }

    @Override
    public Fl selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Fl record, FlExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Fl record, FlExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Fl record) {
        return flMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Fl record) {
        return 0;
    }

    @Override
    public String getSame(String mc) {
        return flMapper.getSame(mc);
    }

    @Override
    public String upgetSame(Fl record) {
        return flMapper.upgetSame(record);
    }
}
