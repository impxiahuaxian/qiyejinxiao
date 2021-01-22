package com.service.impl;

import com.dao.CkMapper;
import com.pojo.Ck;
import com.pojo.CkExample;
import com.service.CkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CkServiceImpl implements CkService {
    @Autowired
    private CkMapper ckMapper;
    @Override
    public int countByExample(CkExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(CkExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ckMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Ck record) {
        return 0;
    }

    @Override
    public int insertSelective(Ck record) {
        return ckMapper.insertSelective(record);
    }

    @Override
    public List<Ck> selectByExample(CkExample example) {
        return null;
    }

    @Override
    public Ck selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Ck record, CkExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Ck record, CkExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Ck record) {
        return ckMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Ck record) {
        return 0;
    }

    @Override
    public String getSame(String ckbh) {
        return ckMapper.getSame(ckbh);
    }

    @Override
    public String upgetSame(Ck record) {
        return ckMapper.upgetSame(record);
    }

    @Override
    public Ck selectByBh(String ckbh) {
        return ckMapper.selectByBh(ckbh);
    }

    @Override
    public String selectSl(String rkbh) {
        return ckMapper.selectSl(rkbh);
    }
}
