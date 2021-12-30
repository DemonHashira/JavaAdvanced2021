package com.example.lecture14.service;

import com.example.lecture14.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private List<Person> personList = new ArrayList<>();

    public PersonService() {
        personList = new ArrayList<>();
        Person viktor = new Person();
        viktor.setName("Viktor");
        personList.add(viktor);
    }

    public List<Person> findAll() {
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
