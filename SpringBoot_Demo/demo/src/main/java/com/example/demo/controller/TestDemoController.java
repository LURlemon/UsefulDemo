package com.example.demo.controller;

import com.example.demo.entity.TestDemo;
import com.example.demo.service.TestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/TestDemo")
public class TestDemoController {

    @Autowired
    private TestDemoService testDemoService;

    @ResponseBody
    @RequestMapping("/getTestDemoList")
    List<TestDemo> getTestDemoList()
    {
        System.out.println("This is ServiceImpl");
        return testDemoService.getTestDemoList();
    }

    @ResponseBody
    @RequestMapping("/getById")
    TestDemo getById(Integer id)
    {
        return testDemoService.getById(id);
    }

    @ResponseBody
    @RequestMapping("/addTestDemo")
    public String addTestDemo(Integer id, String magicId)
    {
        TestDemo testDemo = new TestDemo();
        testDemo.setId(id);
        testDemo.setMagicId(magicId);
        testDemo.setFirstName("  ");
        testDemo.setLastName("  ");

        testDemoService.addTestDemo(testDemo);
        return "success register!";
    }

    @ResponseBody
    @RequestMapping("deleteById")
    public String deleteById(Integer id)
    {
        boolean flag = false;
        List<TestDemo> testDemoList = testDemoService.getTestDemoList();
        for(TestDemo t: testDemoList)
        {
            if(t.getId().equals(id))
            {
                flag = true;
            }
        }
        if (flag)
        {
            testDemoService.deleteById(id);
            return "success delete!";
        }

        return "fail delete";
    }
}
