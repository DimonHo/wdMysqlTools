package com.wd.cs.dao;

import com.wd.cs.po.DocSources;
import com.wd.cs.po.DocSourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocSourcesMapper {
    int countByExample(DocSourcesExample example);

    int deleteByExample(DocSourcesExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocSources record);

    int insertSelective(DocSources record);

    List<DocSources> selectByExample(DocSourcesExample example);

    DocSources selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocSources record, @Param("example") DocSourcesExample example);

    int updateByExample(@Param("record") DocSources record, @Param("example") DocSourcesExample example);

    int updateByPrimaryKeySelective(DocSources record);

    int updateByPrimaryKey(DocSources record);
}