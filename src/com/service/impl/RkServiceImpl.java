package com.service.impl;

import com.dao.RkMapper;
import com.pojo.Rk;
import com.pojo.RkExample;
import com.service.RkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RkServiceImpl implements RkService {
    @Autowired
    private RkMapper rkMapper;
    @Override
    public int countByExample(RkExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(RkExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return rkMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Rk record) {
        return 0;
    }

    @Override
    public int insertSelective(Rk record) {
        return rkMapper.insertSelective(record);
    }

    @Override
    public List<Rk> selectByExample(RkExample example) {
        return null;
    }

    @Override
    public Rk selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Rk record, RkExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Rk record, RkExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Rk record) {
        return rkMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Rk record) {
        return 0;
    }

    @Override
    public String getSame(String rkbh) {
        return rkMapper.getSame(rkbh);
    }

    @Override
    public String upgetSame(Rk record) {
        return rkMapper.upgetSame(record);
    }

    @Override
    public Rk selectByBh(String rkbh) {
        return rkMapper.selectByBh(rkbh);
    }
}
