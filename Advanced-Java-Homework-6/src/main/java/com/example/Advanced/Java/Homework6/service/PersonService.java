package com.example.Advanced.Java.Homework6.service;

import com.example.Advanced.Java.Homework6.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private List<Person> personList;

    PersonService() {
        personList = new ArrayList<>();
    }

    public List<Person> findALl() {
        return personList;
    }

    public Person addPerson(Person personToAdd) {
        for (Person searchPerson:personList) {
            if (personToAdd.getName().equals(searchPerson.getName())) {
                return searchPerson;
            }
        }
        personList.add(personToAdd);
        return personToAdd;
    }
}
