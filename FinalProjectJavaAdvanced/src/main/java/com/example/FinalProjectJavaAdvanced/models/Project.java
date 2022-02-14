package com.example.FinalProjectJavaAdvanced.models;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.springframework.data.annotation.Id;

public class Project {

    @Id
    private Long id;
    private String name;
    private Department projectDepartment;

    public Project(Long id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.projectDepartment = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return projectDepartment;
    }

    public void setDepartment(Department department) {
        this.projectDepartment = department;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", department=" + projectDepartment +
                '}';
    }
}
