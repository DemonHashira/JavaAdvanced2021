package com.example.Advanced.Java.Homework6.service;

import com.example.Advanced.Java.Homework6.exception.MissingId;
import com.example.Advanced.Java.Homework6.exception.NegativeSalary;
import com.example.Advanced.Java.Homework6.exception.NoNamePresented;
import com.example.Advanced.Java.Homework6.exception.NoSalary;
import com.example.Advanced.Java.Homework6.model.Employee;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeService {

    @Autowired
    PersonService personService;

    private ArrayList<Employee> employeeArrayList;

    EmployeeService() {
        employeeArrayList = new ArrayList<>();
    }

    public Employee addEmployee(Employee employee) {
        if (employee.getPerson().getName() == null) {
            throw new NoNamePresented();
        } else if (employee.getSalary() < 0) {
            throw new NegativeSalary();
        } else if (employee.getId() == 0){
            throw new MissingId();
        } else if (employee.getSalary() == 0) {
            throw new NoSalary();
        } else {
            employeeArrayList.add(employee);
            personService.addPerson(employee.getPerson());
            return employee;
        }
    }

    public Employee findEmployeeById(int id) {
        for (Employee employee: employeeArrayList) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public ArrayList<Employee> findAll() {
        return employeeArrayList;
    }

    public void updateEmployee(int id, Employee employee) {
       for (int i = 0; i < employeeArrayList.size(); i++) {
           Employee e = employeeArrayList.get(i);
           if (e.getId() == id) {
               employeeArrayList.set(i, employee);
               return;
           }
        }
    }

    public void deleteEmployee(int id) {
        employeeArrayList.removeIf(t -> t.getId() == id);
    }

}
