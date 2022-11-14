package com.kaiming.learn.citest;

import org.testng.annotations.*;
import org.testng.annotations.Test;

/**
 * @描述 : <...>
 * @博客 : www.cnblogs.com/uncleyong
 * @微信 : ren168632201
 */
public class TestAnnotationB {
    @Test
    public  void testb(){
        System.out.println("TestAnnotation.testb==");
        System.out.println("线程ID：" + Thread.currentThread().getId());
    }

    @Test
    public  void testb2(){
        System.out.println("TestAnnotationB.testb2==");
    }

    @BeforeMethod
    public void beforeMethodTestb(){
        System.out.println("TestAnnotationB.beforeMethodTestb==");
    }

    @AfterMethod
    public void afterMethodTestb(){
        System.out.println("TestAnnotationB.afterMethodTestb==");
    }

    @BeforeClass
    public void beforeClassTestb(){
        System.out.println("TestAnnotationB.beforeClassTestb==");
    }

    @AfterClass
    public void afterClassTestb(){
        System.out.println("TestAnnotationB.afterClassTestb==");
    }

    @BeforeSuite
    public void beforeSuiteTestb(){
        System.out.println("TestAnnotationB.beforeSuiteTestb==");
    }

    @AfterSuite
    public void afterSuiteTestb(){
        System.out.println("TestAnnotationB.afterSuiteTestb==");
    }
}
