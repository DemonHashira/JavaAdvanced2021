package com.example.lecture13.config;


import com.example.lecture13.person.Person;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = "person")
public class ProjectConfig {

    @Bean("Ben")
    @Order(1)
    Person ben(){
        Person ben=new Person();
        ben.setName("ben");
        return ben;
    }

    @Bean("Jack")
    @Order(2)
    @DependsOn("Ben")
    Person jack(){
        Person jack=new Person();
        jack.setName("jack");
        return jack;
    }

    @Bean
    String name(){
        return "Viktor";
    }
}