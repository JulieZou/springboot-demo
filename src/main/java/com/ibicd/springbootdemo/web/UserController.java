package com.ibicd.springbootdemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserInterface userInterface;
    @GetMapping("/test")
    public String test(){
        return userInterface.test();
    }
}
