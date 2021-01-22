package com.service;
/**
 * 定义管理用户接口
 */
import com.pojo.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    String getSame(String username);

    String upgetSame(Admin record);

    List<Admin> adminLogin(Admin record);

    int adminupdateByUsername(Admin record);

    List<Admin> admincheckPwd(Admin record);

    int adminupPwd(Admin record);
}
