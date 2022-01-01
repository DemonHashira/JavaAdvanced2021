package com.example.lecture13.homework;

import java.util.ArrayList;
import java.util.List;

public class Firm {

    private String name;
    private ArrayList<Person> employee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getEmployee() {
        return employee;
    }

    public void setEmployee(ArrayList<Person> employee) {
        this.employee = employee;
    }
}
