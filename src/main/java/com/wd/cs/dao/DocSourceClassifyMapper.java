package com.wd.cs.dao;

import com.wd.cs.po.DocSourceClassify;
import com.wd.cs.po.DocSourceClassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocSourceClassifyMapper {
    int countByExample(DocSourceClassifyExample example);

    int deleteByExample(DocSourceClassifyExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocSourceClassify record);

    int insertSelective(DocSourceClassify record);

    List<DocSourceClassify> selectByExample(DocSourceClassifyExample example);

    DocSourceClassify selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocSourceClassify record, @Param("example") DocSourceClassifyExample example);

    int updateByExample(@Param("record") DocSourceClassify record, @Param("example") DocSourceClassifyExample example);

    int updateByPrimaryKeySelective(DocSourceClassify record);

    int updateByPrimaryKey(DocSourceClassify record);
}