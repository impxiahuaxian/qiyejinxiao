package com.service.impl;

import com.dao.KfMapper;
import com.pojo.Kf;
import com.pojo.KfExample;
import com.service.KfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KfServiceImpl implements KfService {
    @Autowired
    private KfMapper kfMapper;
    @Override
    public int countByExample(KfExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(KfExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return kfMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Kf record) {
        return 0;
    }

    @Override
    public int insertSelective(Kf record) {
        return kfMapper.insertSelective(record);
    }

    @Override
    public List<Kf> selectByExample(KfExample example) {
        return null;
    }

    @Override
    public Kf selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Kf record, KfExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Kf record, KfExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Kf record) {
        return kfMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Kf record) {
        return 0;
    }

    @Override
    public String getSame(String mc) {
        return kfMapper.getSame(mc);
    }

    @Override
    public String upgetSame(Kf record) {
        return kfMapper.upgetSame(record);
    }
}
