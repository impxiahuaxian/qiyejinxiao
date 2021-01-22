package com.service;

import com.pojo.Rt;
import com.pojo.RtExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RtService {
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
