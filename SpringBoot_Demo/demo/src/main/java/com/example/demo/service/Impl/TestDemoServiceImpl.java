package com.example.demo.service.Impl;

import com.example.demo.entity.TestDemo;
import com.example.demo.entity.TestDemoExample;
import com.example.demo.mapper.TestDemoMapper;
import com.example.demo.service.TestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestDemoServiceImpl implements TestDemoService {

    @Autowired
    TestDemoMapper testDemoMapper;

    @Override
    public List<TestDemo> getTestDemoList()
    {
        System.out.println("This is ServiceImpl");
        return testDemoMapper.selectByExample(new TestDemoExample());
    }

    @Override
    public TestDemo getById(Integer id)
    {
        return testDemoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteById(Integer id){
        return testDemoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addTestDemo(TestDemo testDemo)
    {
        return testDemoMapper.insert(testDemo);
    }
}
