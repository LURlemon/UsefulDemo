package com.example.demo.service;

import com.example.demo.entity.TestDemo;

import java.util.List;

public interface TestDemoService {

    List<TestDemo> getTestDemoList();

    TestDemo getById(Integer id);

    int deleteById(Integer id);

    int addTestDemo(TestDemo testDemo);

}
