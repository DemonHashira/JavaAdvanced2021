package com.example.FinalProjectJavaAdvanced.models;

import org.springframework.data.annotation.Id;

public class Employee {

    @Id
    private String name;
    private String lastName;
    private String address;
    private int salary;
    private Department department;

    public Employee(String name, String lastName, String address, int salary, Department department) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
        this.department = department;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
