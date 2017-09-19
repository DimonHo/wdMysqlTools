package com.wd.cs.dao;

import com.wd.cs.po.DocSubjects;
import com.wd.cs.po.DocSubjectsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocSubjectsMapper {
    int countByExample(DocSubjectsExample example);

    int deleteByExample(DocSubjectsExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocSubjects record);

    int insertSelective(DocSubjects record);

    List<DocSubjects> selectByExample(DocSubjectsExample example);

    DocSubjects selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocSubjects record, @Param("example") DocSubjectsExample example);

    int updateByExample(@Param("record") DocSubjects record, @Param("example") DocSubjectsExample example);

    int updateByPrimaryKeySelective(DocSubjects record);

    int updateByPrimaryKey(DocSubjects record);
}