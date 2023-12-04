package com.ibicd.springbootdemo.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class JulieAspect {

    @Before("execution(public String com.ibicd.springbootdemo.web.UserService.test())")
    public void aspectBefore(JoinPoint joinPoint){
        System.out.println("userService Before");
    }
}
