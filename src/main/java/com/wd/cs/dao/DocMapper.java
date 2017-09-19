package com.wd.cs.dao;

import com.wd.cs.po.Doc;
import com.wd.cs.po.DocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocMapper {
    int countByExample(DocExample example);

    int deleteByExample(DocExample example);

    int deleteByPrimaryKey(String id);

    int insert(Doc record);

    int insertSelective(Doc record);

    List<Doc> selectByExample(DocExample example);

    Doc selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Doc record, @Param("example") DocExample example);

    int updateByExample(@Param("record") Doc record, @Param("example") DocExample example);

    int updateByPrimaryKeySelective(Doc record);

    int updateByPrimaryKey(Doc record);
}