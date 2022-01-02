package com.example.lecture13.person;

import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class Student {

    private Person person;
    private List<String> lessons;


    public Student(@Qualifier("Jack") Person person){
        this.person=person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<String> getLessons() {
        return lessons;
    }

    public void setLessons(List<String> lessons) {
        this.lessons = lessons;
    }
}