package com.example.lecture13.person;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
