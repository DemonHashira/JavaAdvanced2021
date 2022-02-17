package com.example.FinalProjectJavaAdvanced.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Id;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name = "Department")
@JsonSerialize
public class Department implements Serializable {

    /**
     * Model class for the table Department that includes two columns.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long department_id;
    @Column
    private String name;
    public ArrayList<String> employeeArrayList;
    public int sumOfSalary;

    public Department() {
        employeeArrayList = new ArrayList<>();
    }

    public Department(Long department_id, String name, ArrayList<String> employeeArrayList) {
        this.department_id = department_id;
        this.name = name;
        this.employeeArrayList = employeeArrayList;
    }

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public void setEmployeeArrayList(ArrayList<String> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
    }

    public int getSumOfSalary() {
        return sumOfSalary;
    }

    public void setSumOfSalary(int sumOfSalary) {
        this.sumOfSalary = sumOfSalary;
    }

    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", name='" + name + '\'' +
                ", employeeArrayList=" + employeeArrayList +
                ", sumOfSalary=" + sumOfSalary +
                '}';
    }
}
