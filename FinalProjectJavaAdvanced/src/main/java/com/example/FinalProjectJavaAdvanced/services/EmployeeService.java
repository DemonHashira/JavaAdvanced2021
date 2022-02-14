package com.example.FinalProjectJavaAdvanced.services;

import com.example.FinalProjectJavaAdvanced.exception.EntityDoesNotExist;
import com.example.FinalProjectJavaAdvanced.exception.WrongArguments;
import com.example.FinalProjectJavaAdvanced.models.Employee;
import com.example.FinalProjectJavaAdvanced.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Employee findById(Long id) {
        if(id == null || id <= 0L ){
            throw new WrongArguments();
        } else {
            Optional<Employee> foundEmployee = employeeRepository.findById(id);
            if(foundEmployee.isPresent()){
                return foundEmployee.get();
            }else {
                throw new EntityDoesNotExist();
            }
        }
    }

    public Employee update(Employee employee, Long id) {
        Employee foundEmployee = findById(id);
        foundEmployee.setAddress(employee.getAddress());
        foundEmployee.setDepartment(employee.getDepartment());
        foundEmployee.setName(employee.getName());
        foundEmployee.setLastName(employee.getLastName());
        foundEmployee.setSalary(employee.getSalary());
        employeeRepository.save(foundEmployee);
        return foundEmployee;
    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
