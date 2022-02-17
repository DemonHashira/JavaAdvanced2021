package com.example.FinalProjectJavaAdvanced.services;

import com.example.FinalProjectJavaAdvanced.exception.EntityDoesNotExist;
import com.example.FinalProjectJavaAdvanced.exception.WrongArguments;
import com.example.FinalProjectJavaAdvanced.models.Department;
import com.example.FinalProjectJavaAdvanced.models.Employee;
import com.example.FinalProjectJavaAdvanced.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    /**
     * Service class for the table Employee that has the CRUD logic.
     */

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentService departmentService;

    public EmployeeService() {
    }

    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee findById(Long id) {
        if (id == null || id <= 0L) {
            throw new WrongArguments();
        } else {
            Optional<Employee> foundEmployee = employeeRepository.findById(id);
            if (foundEmployee.isPresent()) {
                return foundEmployee.get();
            } else {
                throw new EntityDoesNotExist();
            }
        }
    }

    public Iterable<Employee> findByName(String name) {
        return employeeRepository.findByName(name);
    }

    public Employee createEmployee(Employee employee, Long id) {
        if (employee.getName() == null || employee.getName().isBlank()) {
            throw new WrongArguments();
        }
        Department employeeDepartment = departmentService.findById(id);
        employee.setDepartment(employeeDepartment);
        employeeDepartment.employeeArrayList.add(employee.getName());
        employeeDepartment.sumOfSalary += employee.getSalary();
        return employeeRepository.save(employee);
    }

    public Employee update(Employee employee, Long idEmployee, Long idDepartment) {
        Department updatedEmployeeDepartment = departmentService.findById(idDepartment);
        Employee foundEmployee = findById(idEmployee);
        foundEmployee.setAddress(employee.getAddress());
        foundEmployee.setDepartment(updatedEmployeeDepartment);
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
