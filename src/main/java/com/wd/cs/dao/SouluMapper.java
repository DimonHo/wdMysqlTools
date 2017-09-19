package com.wd.cs.dao;

import com.wd.cs.po.Soulu;
import com.wd.cs.po.SouluExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SouluMapper {
    int countByExample(SouluExample example);

    int deleteByExample(SouluExample example);

    int deleteByPrimaryKey(String id);

    int insert(Soulu record);

    int insertSelective(Soulu record);

    List<Soulu> selectByExample(SouluExample example);

    Soulu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Soulu record, @Param("example") SouluExample example);

    int updateByExample(@Param("record") Soulu record, @Param("example") SouluExample example);

    int updateByPrimaryKeySelective(Soulu record);

    int updateByPrimaryKey(Soulu record);
}