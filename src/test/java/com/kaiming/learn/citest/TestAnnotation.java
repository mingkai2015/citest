package com.kaiming.learn.citest;

import org.testng.annotations.*;
import org.testng.annotations.Test;
public class TestAnnotation {
    @Test
    public  void test(){
        System.out.println("TestAnnotation.test");
        System.out.println("线程ID：" + Thread.currentThread().getId());
    }

    @Test
    public  void test2(){
        System.out.println("TestAnnotation.test2");
    }

    @BeforeMethod
    public void beforeMethodTest(){
        System.out.println("TestAnnotation.beforeMethodTest");
    }

    @AfterMethod
    public void afterMethodTest(){
        System.out.println("TestAnnotation.afterMethodTest");
    }

    @BeforeClass
    public void beforeClassTest(){
        System.out.println("TestAnnotation.beforeClassTest");
    }

    @AfterClass
    public void afterClassTest(){
        System.out.println("TestAnnotation.afterClassTest");
    }

    @BeforeSuite
    public void beforeSuiteTest(){
        System.out.println("TestAnnotation.beforeSuiteTest");
    }

    @AfterSuite
    public void afterSuiteTest(){
        System.out.println("TestAnnotation.afterSuiteTest");
    }
}
