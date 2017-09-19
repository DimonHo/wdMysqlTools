package com.wd.cs.dao;

import com.wd.cs.po.DocClassic;
import com.wd.cs.po.DocClassicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocClassicMapper {
    int countByExample(DocClassicExample example);

    int deleteByExample(DocClassicExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocClassic record);

    int insertSelective(DocClassic record);

    List<DocClassic> selectByExample(DocClassicExample example);

    DocClassic selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocClassic record, @Param("example") DocClassicExample example);

    int updateByExample(@Param("record") DocClassic record, @Param("example") DocClassicExample example);

    int updateByPrimaryKeySelective(DocClassic record);

    int updateByPrimaryKey(DocClassic record);
}