package com.example.lecture13.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class ProjectConfig {

    @Bean("Ben")
    Person getBen(){
        Person ben= new Person();
        ben.setName("Ben");
        ben.setSalary(1000);
        return ben;
    }

    @Bean("Jack")
    Person getJack(){
        Person jack = new Person();
        jack.setName("Jack");
        jack.setSalary(2000);
        return jack;
    }

    @Bean("Ali Express")
    Firm getFirm(){
        Firm firm = new Firm();
        firm.setName("Ali Express");
        ArrayList employee= new ArrayList();
        employee.add(getBen());
        employee.add(getJack());
        firm.setEmployee(employee);
        return firm;
    }

}
