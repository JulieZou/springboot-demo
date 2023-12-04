package com.ibicd.springbootdemo.web;

import com.ibicd.springbootdemo.web.UserInterface;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserInterface {

    public String test(){
        return "Hello Julie";
    }
}
