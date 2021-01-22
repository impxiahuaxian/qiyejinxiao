package com.dao;

import com.pojo.Rt;
import com.pojo.RtExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RtMapper {
    int countByExample(RtExample example);

    int deleteByExample(RtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Rt record);

    int insertSelective(Rt record);

    List<Rt> selectByExample(RtExample example);

    Rt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Rt record, @Param("example") RtExample example);

    int updateByExample(@Param("record") Rt record, @Param("example") RtExample example);

    int updateByPrimaryKeySelective(Rt record);

    int updateByPrimaryKey(Rt record);
}