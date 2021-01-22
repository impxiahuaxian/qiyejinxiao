package com.service;

import com.pojo.Ck;
import com.pojo.CkExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CkService {
    int countByExample(CkExample example);

    int deleteByExample(CkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ck record);

    int insertSelective(Ck record);

    List<Ck> selectByExample(CkExample example);

    Ck selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ck record, @Param("example") CkExample example);

    int updateByExample(@Param("record") Ck record, @Param("example") CkExample example);

    int updateByPrimaryKeySelective(Ck record);

    int updateByPrimaryKey(Ck record);
    String getSame(String ckbh);

    String upgetSame(Ck record);
    Ck selectByBh(String ckbh);
    String selectSl(String rkbh);
}
