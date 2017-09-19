package com.wd.cs.dao;

import com.wd.cs.po.DocBiyin;
import com.wd.cs.po.DocBiyinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocBiyinMapper {
    int countByExample(DocBiyinExample example);

    int deleteByExample(DocBiyinExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocBiyin record);

    int insertSelective(DocBiyin record);

    List<DocBiyin> selectByExample(DocBiyinExample example);

    DocBiyin selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocBiyin record, @Param("example") DocBiyinExample example);

    int updateByExample(@Param("record") DocBiyin record, @Param("example") DocBiyinExample example);

    int updateByPrimaryKeySelective(DocBiyin record);

    int updateByPrimaryKey(DocBiyin record);
}