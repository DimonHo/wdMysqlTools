package com.wd.cs.dao;

import com.wd.cs.po.HisJournal;
import com.wd.cs.po.HisJournalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisJournalMapper {
    int countByExample(HisJournalExample example);

    int deleteByExample(HisJournalExample example);

    int deleteByPrimaryKey(String id);

    int insert(HisJournal record);

    int insertSelective(HisJournal record);

    List<HisJournal> selectByExample(HisJournalExample example);

    HisJournal selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HisJournal record, @Param("example") HisJournalExample example);

    int updateByExample(@Param("record") HisJournal record, @Param("example") HisJournalExample example);

    int updateByPrimaryKeySelective(HisJournal record);

    int updateByPrimaryKey(HisJournal record);
}