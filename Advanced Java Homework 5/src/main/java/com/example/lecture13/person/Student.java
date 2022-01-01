package com.example.lecture13.person;


import org.springframework.beans.factory.annotation.Qualifier;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private Person person;
    private ArrayList<String> lessons;


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

    public void setLessons(ArrayList<String> lessons) {
        this.lessons = lessons;
    }
}
