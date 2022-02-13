package com.example.FinalProjectJavaAdvanced.services;

import com.example.FinalProjectJavaAdvanced.exception.WrongArguments;
import com.example.FinalProjectJavaAdvanced.models.Department;
import com.example.FinalProjectJavaAdvanced.models.Employee;
import com.example.FinalProjectJavaAdvanced.repositories.DepartmentRepository;
import com.example.FinalProjectJavaAdvanced.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee) {
        if (employee.getName() == null || employee.getName().isBlank()) {
            throw new WrongArguments();
        }
        return employeeRepository.save(employee);
    }
}
