package com.example.demo.mapper;

import com.example.demo.entity.TestDemo;
import com.example.demo.entity.TestDemoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestDemoMapper {
    int countByExample(TestDemoExample example);

    int deleteByExample(TestDemoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestDemo record);

    int insertSelective(TestDemo record);

    List<TestDemo> selectByExample(TestDemoExample example);

    TestDemo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestDemo record, @Param("example") TestDemoExample example);

    int updateByExample(@Param("record") TestDemo record, @Param("example") TestDemoExample example);

    int updateByPrimaryKeySelective(TestDemo record);

    int updateByPrimaryKey(TestDemo record);
}