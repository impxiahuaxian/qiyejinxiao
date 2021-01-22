package com.service.impl;
/**
 * 管理用户接口实现类
 */

import com.dao.AdminMapper;
import com.pojo.Admin;
import com.service.AdminService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImp implements AdminService {

    @Autowired
    private AdminMapper adminMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return adminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Admin record) {
        return adminMapper.insert(record);
    }

    @Override
    public int insertSelective(Admin record) {
        return adminMapper.insertSelective(record);
    }



    @Override
    public Admin selectByPrimaryKey(Integer id) {
        return adminMapper.selectByPrimaryKey(id);
    }


    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return adminMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return adminMapper.updateByPrimaryKey(record);
    }

    @Override
    public String getSame(String username) {
        return adminMapper.getSame(username);
    }

    @Override
    public String upgetSame(Admin record) {
        return adminMapper.upgetSame(record);
    }

    @Override
    public List<Admin> adminLogin(Admin record) {
        return adminMapper.adminLogin(record);
    }

    @Override
    public int adminupdateByUsername(Admin record) {
        return adminMapper.adminupdateByUsername(record);
    }

    @Override
    public List<Admin> admincheckPwd(Admin record) {
        return adminMapper.admincheckPwd(record);
    }

    @Override
    public int adminupPwd(Admin record) {
        return adminMapper.adminupPwd(record);
    }
}
