package com.dao;

import com.pojo.Rk;
import com.pojo.RkExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RkMapper {
    int countByExample(RkExample example);

    int deleteByExample(RkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Rk record);

    int insertSelective(Rk record);

    List<Rk> selectByExample(RkExample example);

    Rk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Rk record, @Param("example") RkExample example);

    int updateByExample(@Param("record") Rk record, @Param("example") RkExample example);

    int updateByPrimaryKeySelective(Rk record);

    int updateByPrimaryKey(Rk record);
    String getSame(String rkbh);

    String upgetSame(Rk record);
    Rk selectByBh(String rkbh);
}