package com.wd.cs.dao;

import com.wd.cs.po.DocSoulu;
import com.wd.cs.po.DocSouluExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocSouluMapper {
    int countByExample(DocSouluExample example);

    int deleteByExample(DocSouluExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocSoulu record);

    int insertSelective(DocSoulu record);

    List<DocSoulu> selectByExample(DocSouluExample example);

    DocSoulu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocSoulu record, @Param("example") DocSouluExample example);

    int updateByExample(@Param("record") DocSoulu record, @Param("example") DocSouluExample example);

    int updateByPrimaryKeySelective(DocSoulu record);

    int updateByPrimaryKey(DocSoulu record);
}