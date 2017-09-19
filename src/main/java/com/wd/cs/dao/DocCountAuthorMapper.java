package com.wd.cs.dao;

import com.wd.cs.po.DocCountAuthor;
import com.wd.cs.po.DocCountAuthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocCountAuthorMapper {
    int countByExample(DocCountAuthorExample example);

    int deleteByExample(DocCountAuthorExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocCountAuthor record);

    int insertSelective(DocCountAuthor record);

    List<DocCountAuthor> selectByExample(DocCountAuthorExample example);

    DocCountAuthor selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocCountAuthor record, @Param("example") DocCountAuthorExample example);

    int updateByExample(@Param("record") DocCountAuthor record, @Param("example") DocCountAuthorExample example);

    int updateByPrimaryKeySelective(DocCountAuthor record);

    int updateByPrimaryKey(DocCountAuthor record);
}