package com.wd.cs.dao;

import com.wd.cs.po.DocKeywords;
import com.wd.cs.po.DocKeywordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocKeywordsMapper {
    int countByExample(DocKeywordsExample example);

    int deleteByExample(DocKeywordsExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocKeywords record);

    int insertSelective(DocKeywords record);

    List<DocKeywords> selectByExample(DocKeywordsExample example);

    DocKeywords selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocKeywords record, @Param("example") DocKeywordsExample example);

    int updateByExample(@Param("record") DocKeywords record, @Param("example") DocKeywordsExample example);

    int updateByPrimaryKeySelective(DocKeywords record);

    int updateByPrimaryKey(DocKeywords record);
}