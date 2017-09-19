package com.wd.cs.dao;

import com.wd.cs.po.Journal;
import com.wd.cs.po.JournalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JournalMapper {
    int countByExample(JournalExample example);

    int deleteByExample(JournalExample example);

    int deleteByPrimaryKey(String id);

    int insert(Journal record);

    int insertSelective(Journal record);

    List<Journal> selectByExample(JournalExample example);

    Journal selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Journal record, @Param("example") JournalExample example);

    int updateByExample(@Param("record") Journal record, @Param("example") JournalExample example);

    int updateByPrimaryKeySelective(Journal record);

    int updateByPrimaryKey(Journal record);
}