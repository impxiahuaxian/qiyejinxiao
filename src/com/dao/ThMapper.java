package com.dao;

import com.pojo.Th;
import com.pojo.ThExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ThMapper {
    int countByExample(ThExample example);

    int deleteByExample(ThExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Th record);

    int insertSelective(Th record);

    List<Th> selectByExample(ThExample example);

    Th selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Th record, @Param("example") ThExample example);

    int updateByExample(@Param("record") Th record, @Param("example") ThExample example);

    int updateByPrimaryKeySelective(Th record);

    int updateByPrimaryKey(Th record);
    String selectSlbyCkbh(String ckbh);
    String selectSlbyRkbh(String rkbh);
}