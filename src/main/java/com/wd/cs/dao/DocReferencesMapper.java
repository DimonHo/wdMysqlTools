package com.wd.cs.dao;

import com.wd.cs.po.DocReferences;
import com.wd.cs.po.DocReferencesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocReferencesMapper {
    int countByExample(DocReferencesExample example);

    int deleteByExample(DocReferencesExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocReferences record);

    int insertSelective(DocReferences record);

    List<DocReferences> selectByExample(DocReferencesExample example);

    DocReferences selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocReferences record, @Param("example") DocReferencesExample example);

    int updateByExample(@Param("record") DocReferences record, @Param("example") DocReferencesExample example);

    int updateByPrimaryKeySelective(DocReferences record);

    int updateByPrimaryKey(DocReferences record);
}