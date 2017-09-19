package com.wd.cs.dao;

import com.wd.cs.po.DocAuthor;
import com.wd.cs.po.DocAuthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocAuthorMapper {
    int countByExample(DocAuthorExample example);

    int deleteByExample(DocAuthorExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocAuthor record);

    int insertSelective(DocAuthor record);

    List<DocAuthor> selectByExample(DocAuthorExample example);

    DocAuthor selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocAuthor record, @Param("example") DocAuthorExample example);

    int updateByExample(@Param("record") DocAuthor record, @Param("example") DocAuthorExample example);

    int updateByPrimaryKeySelective(DocAuthor record);

    int updateByPrimaryKey(DocAuthor record);
}