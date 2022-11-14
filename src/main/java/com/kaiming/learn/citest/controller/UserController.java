package com.kaiming.learn.citest.controller;

import com.kaiming.learn.citest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getName1")
    public String getUserName(){
        return userService.getName1();
    }
    @GetMapping("/getName2")
    public String getUserName2(){
        return userService.getName2();
    }

}
