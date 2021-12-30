package com.example.lecture13.config;

import com.example.lecture13.person.Person;
import com.example.lecture13.person.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "person")
public class ProjectConfig {

    @Bean("Ben")
    @Primary
    Person ben() {
        Person ben = new Person();
        ben.setName("Ben");
        return ben;
    }

    @Bean("Jack")
    Person jack() {
        Person jack = new Person();
        jack.setName("jack");
        return jack;
    }

    @Bean
    String name() {
        return "Viktor";
    }

//    @Bean
//    Student student() {
//        Student student = new Student();
//        Person testPerson = new Person();
//        testPerson.setName("Test");
//        student.setPerson(jack());
//        return new Student();
//    }
}
