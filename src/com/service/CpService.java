package com.service;

import com.pojo.Cp;
import com.pojo.CpExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CpService {
    int countByExample(CpExample example);

    int deleteByExample(CpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cp record);

    int insertSelective(Cp record);

    List<Cp> selectByExample(CpExample example);

    Cp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cp record, @Param("example") CpExample example);

    int updateByExample(@Param("record") Cp record, @Param("example") CpExample example);

    int updateByPrimaryKeySelective(Cp record);

    int updateByPrimaryKey(Cp record);
    String getSame(String mc);

    String upgetSame(Cp record);
}
