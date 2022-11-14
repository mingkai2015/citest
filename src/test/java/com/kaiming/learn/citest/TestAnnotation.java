package com.kaiming.learn.citest;

import com.kaiming.learn.citest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
public class TestAnnotation extends AbstractTestNGSpringContextTests {

    @Autowired
    private UserService service;

    @Test
    public void test1(){
        System.out.println(service.getName1());
    }

    @Test
    public void test2(){
        System.out.println(service.getName2());
    }
}
