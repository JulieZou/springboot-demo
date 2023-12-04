package com.ibicd.springbootdemo.entity;


import lombok.Data;

@Data
public class User {

    private Long id;

    private String name;

    private Integer age;

    public User(String name) {
        this.name = name;
    }

}
