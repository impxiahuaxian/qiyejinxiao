package com.dao;

import com.pojo.Kf;
import com.pojo.KfExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface KfMapper {
    int countByExample(KfExample example);

    int deleteByExample(KfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Kf record);

    int insertSelective(Kf record);

    List<Kf> selectByExample(KfExample example);

    Kf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Kf record, @Param("example") KfExample example);

    int updateByExample(@Param("record") Kf record, @Param("example") KfExample example);

    int updateByPrimaryKeySelective(Kf record);

    int updateByPrimaryKey(Kf record);
    String getSame(String mc);

    String upgetSame(Kf record);
}