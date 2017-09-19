package com.wd.cs.dao;

import com.wd.cs.po.DocBookAuthor;
import com.wd.cs.po.DocBookAuthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocBookAuthorMapper {
    int countByExample(DocBookAuthorExample example);

    int deleteByExample(DocBookAuthorExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocBookAuthor record);

    int insertSelective(DocBookAuthor record);

    List<DocBookAuthor> selectByExample(DocBookAuthorExample example);

    DocBookAuthor selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocBookAuthor record, @Param("example") DocBookAuthorExample example);

    int updateByExample(@Param("record") DocBookAuthor record, @Param("example") DocBookAuthorExample example);

    int updateByPrimaryKeySelective(DocBookAuthor record);

    int updateByPrimaryKey(DocBookAuthor record);
}