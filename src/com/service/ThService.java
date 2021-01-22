package com.service;

import com.pojo.Th;
import com.pojo.ThExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ThService {
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
