package com.wd.cs.dao;

import com.wd.cs.po.DocBookEditor;
import com.wd.cs.po.DocBookEditorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocBookEditorMapper {
    int countByExample(DocBookEditorExample example);

    int deleteByExample(DocBookEditorExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocBookEditor record);

    int insertSelective(DocBookEditor record);

    List<DocBookEditor> selectByExample(DocBookEditorExample example);

    DocBookEditor selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocBookEditor record, @Param("example") DocBookEditorExample example);

    int updateByExample(@Param("record") DocBookEditor record, @Param("example") DocBookEditorExample example);

    int updateByPrimaryKeySelective(DocBookEditor record);

    int updateByPrimaryKey(DocBookEditor record);
}