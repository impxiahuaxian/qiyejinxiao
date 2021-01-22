package com.dao;

import com.pojo.Gy;
import com.pojo.GyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GyMapper {
    int countByExample(GyExample example);

    int deleteByExample(GyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gy record);

    int insertSelective(Gy record);

    List<Gy> selectByExample(GyExample example);

    Gy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gy record, @Param("example") GyExample example);

    int updateByExample(@Param("record") Gy record, @Param("example") GyExample example);

    int updateByPrimaryKeySelective(Gy record);

    int updateByPrimaryKey(Gy record);
    String getSame(String mc);

    String upgetSame(Gy record);
}