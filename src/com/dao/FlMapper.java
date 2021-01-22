package com.dao;

import com.pojo.Fl;
import com.pojo.FlExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FlMapper {
    int countByExample(FlExample example);

    int deleteByExample(FlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Fl record);

    int insertSelective(Fl record);

    List<Fl> selectByExample(FlExample example);

    Fl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Fl record, @Param("example") FlExample example);

    int updateByExample(@Param("record") Fl record, @Param("example") FlExample example);

    int updateByPrimaryKeySelective(Fl record);

    int updateByPrimaryKey(Fl record);
    String getSame(String mc);

    String upgetSame(Fl record);
}