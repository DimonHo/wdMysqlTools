package com.wd.cs.dao;

import com.wd.cs.po.DocKeywordsPlus;
import com.wd.cs.po.DocKeywordsPlusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocKeywordsPlusMapper {
    int countByExample(DocKeywordsPlusExample example);

    int deleteByExample(DocKeywordsPlusExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocKeywordsPlus record);

    int insertSelective(DocKeywordsPlus record);

    List<DocKeywordsPlus> selectByExample(DocKeywordsPlusExample example);

    DocKeywordsPlus selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocKeywordsPlus record, @Param("example") DocKeywordsPlusExample example);

    int updateByExample(@Param("record") DocKeywordsPlus record, @Param("example") DocKeywordsPlusExample example);

    int updateByPrimaryKeySelective(DocKeywordsPlus record);

    int updateByPrimaryKey(DocKeywordsPlus record);
}