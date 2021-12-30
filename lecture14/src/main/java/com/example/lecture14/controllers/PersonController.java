package com.example.lecture14.controllers;

import com.example.lecture14.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonController {

    private List<Person> personList = new ArrayList<>();

    public PersonController() {
        personList = new ArrayList<>();
        Person viktor = new Person();
        viktor.setName("Viktor");
        personList.add(viktor);
    }

    @GetMapping("/person")
    public String viewPerson(Model page) {
        page.addAttribute("persons",personList);
        page.addAttribute("color","blue");
        for (Person selectedPerson:personList) {
            System.out.println(selectedPerson.getName());
        }
        return "person.html";
    }

    @PostMapping("/person")
    public String addPerson(Person postPerson, Model page) {
        personList.add(postPerson);
        page.addAttribute("persons", personList);
        return "person.html";
    }

}
