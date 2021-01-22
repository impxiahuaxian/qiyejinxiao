package com.service.impl;

import com.dao.ThMapper;
import com.pojo.Th;
import com.pojo.ThExample;
import com.service.ThService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThServiceImpl implements ThService {
    @Autowired
    private ThMapper thMapper;
    @Override
    public int countByExample(ThExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ThExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return thMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Th record) {
        return 0;
    }

    @Override
    public int insertSelective(Th record) {
        return thMapper.insertSelective(record);
    }

    @Override
    public List<Th> selectByExample(ThExample example) {
        return null;
    }

    @Override
    public Th selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Th record, ThExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Th record, ThExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Th record) {
        return thMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Th record) {
        return 0;
    }

    @Override
    public String selectSlbyCkbh(String ckbh) {
        return thMapper.selectSlbyCkbh(ckbh);
    }

    @Override
    public String selectSlbyRkbh(String rkbh) {
        return thMapper.selectSlbyRkbh(rkbh);
    }
}
