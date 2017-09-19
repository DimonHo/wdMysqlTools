package com.wd.cs.dao;

import com.wd.cs.po.DocSpider;
import com.wd.cs.po.DocSpiderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocSpiderMapper {
    int countByExample(DocSpiderExample example);

    int deleteByExample(DocSpiderExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocSpider record);

    int insertSelective(DocSpider record);

    List<DocSpider> selectByExample(DocSpiderExample example);

    DocSpider selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocSpider record, @Param("example") DocSpiderExample example);

    int updateByExample(@Param("record") DocSpider record, @Param("example") DocSpiderExample example);

    int updateByPrimaryKeySelective(DocSpider record);

    int updateByPrimaryKey(DocSpider record);
}