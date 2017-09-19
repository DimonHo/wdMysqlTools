package com.wd.cs.dao;

import com.wd.cs.po.DocType;
import com.wd.cs.po.DocTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocTypeMapper {
    int countByExample(DocTypeExample example);

    int deleteByExample(DocTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocType record);

    int insertSelective(DocType record);

    List<DocType> selectByExample(DocTypeExample example);

    DocType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocType record, @Param("example") DocTypeExample example);

    int updateByExample(@Param("record") DocType record, @Param("example") DocTypeExample example);

    int updateByPrimaryKeySelective(DocType record);

    int updateByPrimaryKey(DocType record);
}