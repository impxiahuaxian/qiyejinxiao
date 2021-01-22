package com.service;

import com.pojo.Gy;
import com.pojo.GyExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GyService {
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
