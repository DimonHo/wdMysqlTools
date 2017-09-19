package com.wd.cs.dao;

import com.wd.cs.po.DocGroupAuthor;
import com.wd.cs.po.DocGroupAuthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocGroupAuthorMapper {
    int countByExample(DocGroupAuthorExample example);

    int deleteByExample(DocGroupAuthorExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocGroupAuthor record);

    int insertSelective(DocGroupAuthor record);

    List<DocGroupAuthor> selectByExample(DocGroupAuthorExample example);

    DocGroupAuthor selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocGroupAuthor record, @Param("example") DocGroupAuthorExample example);

    int updateByExample(@Param("record") DocGroupAuthor record, @Param("example") DocGroupAuthorExample example);

    int updateByPrimaryKeySelective(DocGroupAuthor record);

    int updateByPrimaryKey(DocGroupAuthor record);
}