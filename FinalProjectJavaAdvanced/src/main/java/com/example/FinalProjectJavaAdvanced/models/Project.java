package com.example.FinalProjectJavaAdvanced.models;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.springframework.data.annotation.Id;

public class Project {

    @Id
    private String name;
    private Department department;

    public Project(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}
