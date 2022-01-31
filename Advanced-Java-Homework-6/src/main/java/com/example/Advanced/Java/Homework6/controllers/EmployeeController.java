package com.example.Advanced.Java.Homework6.controllers;

import com.example.Advanced.Java.Homework6.model.Employee;
import com.example.Advanced.Java.Homework6.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/allEmployees")
    public ArrayList<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.findEmployeeById(id);
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        employee = employeeService.addEmployee(employee);
        return employee;
    }

    @PutMapping("/employee/{id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
        employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }
}
