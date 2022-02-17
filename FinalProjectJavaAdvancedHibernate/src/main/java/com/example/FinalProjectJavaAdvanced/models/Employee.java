package com.example.FinalProjectJavaAdvanced.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Id;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Employee")
@JsonSerialize
public class Employee implements Serializable {

    /**
     * Model class for the table Employee that includes six columns.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String address;
    private int salary;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "department_id")
    private Department department;

    public Employee() {
    }

    public Employee(Long id, String name, String lastName, String address, int salary, Department department) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
