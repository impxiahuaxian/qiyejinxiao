package com.service;


import com.pojo.Fl;
import com.pojo.FlExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FlService {
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
    String getSame(String paperName);

    String upgetSame(Fl record);
}
