package com.dao;
/**
 * 数据操作
 */
import com.pojo.Admin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
/**
 * 添加了@Mapper注解之后这个接口在编译时会生成相应的实现类
 *
 * 需要注意的是：这个接口中不可以定义同名的方法，因为会生成相同的id
 * 也就是说这个接口是不支持重载的
 */

@Mapper
public interface AdminMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    String getSame(String paperName);

    String upgetSame(Admin record);

    List<Admin> adminLogin(Admin record);

    int adminupdateByUsername(Admin record);

    List<Admin> admincheckPwd(Admin record);

    int adminupPwd(Admin record);
}