package com.example.lecture13.config;

import com.example.lecture13.person.Person;
import org.springframework.context.annotation.*;

@ComponentScan(basePackages = "person")
public class ProjectConfig {

    @Bean("Ben")
    Person ben(){
        Person ben=new Person();
        ben.setName("ben");
        return ben;
    }

    @Bean("Jack")
    Person jack(){
        Person jack=new Person();
        jack.setName("jack");
        return jack;
    }
}
