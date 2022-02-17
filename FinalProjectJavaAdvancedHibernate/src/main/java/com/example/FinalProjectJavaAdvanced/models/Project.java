package com.example.FinalProjectJavaAdvanced.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "Project")
@JsonSerialize
public class Project {

    /**
     * Model class for the table Project that includes three columns.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "department_id")
    private Department department;

    public Project() {
    }

    public Project(Long id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
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
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
