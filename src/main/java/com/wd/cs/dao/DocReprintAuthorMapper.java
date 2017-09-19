package com.wd.cs.dao;

import com.wd.cs.po.DocReprintAuthor;
import com.wd.cs.po.DocReprintAuthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocReprintAuthorMapper {
    int countByExample(DocReprintAuthorExample example);

    int deleteByExample(DocReprintAuthorExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocReprintAuthor record);

    int insertSelective(DocReprintAuthor record);

    List<DocReprintAuthor> selectByExample(DocReprintAuthorExample example);

    DocReprintAuthor selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocReprintAuthor record, @Param("example") DocReprintAuthorExample example);

    int updateByExample(@Param("record") DocReprintAuthor record, @Param("example") DocReprintAuthorExample example);

    int updateByPrimaryKeySelective(DocReprintAuthor record);

    int updateByPrimaryKey(DocReprintAuthor record);
}