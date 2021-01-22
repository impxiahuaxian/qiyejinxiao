package com.service;

import com.pojo.Kf;
import com.pojo.KfExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KfService {
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
