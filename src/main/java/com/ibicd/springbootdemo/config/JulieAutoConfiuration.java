package com.ibicd.springbootdemo.config;

import com.ibicd.springbootdemo.entity.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

public class JulieAutoConfiuration {

    @Bean
    @ConditionalOnMissingBean(User.class)
    public User user(){
        return new User("JulieAutoConfiuration");
    }
}
