package com.example.FinalProjectJavaAdvanced.services;

import com.example.FinalProjectJavaAdvanced.models.Department;
import com.example.FinalProjectJavaAdvanced.models.Employee;
import com.example.FinalProjectJavaAdvanced.repositories.DepartmentRepository;
import com.example.FinalProjectJavaAdvanced.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class EmployeeServiceTest {

    /**
     * Test for employee service class.
     */

    @MockBean
    private EmployeeRepository employeeRepository;

    @MockBean
    private DepartmentRepository departmentRepository;

    @Autowired
    private DepartmentService departmentService;

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void findByName() {
    }

    @Test
    void createEmployee() {
        Department department = new Department();
        department.setDepartment_id(1L);
        department.setName("Test");
        department.setSumOfSalary(5000);
        when(departmentRepository.findById(1L)).thenReturn(Optional.of(department));

        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Viktor");
        employee.setLastName("Logodazhki");
        employee.setAddress("Preslav");
        employee.setSalary(5000);
        employee.setDepartment(department);
        department.employeeArrayList.add(employee.getName());
        department.sumOfSalary += employee.getSalary();

        when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));
    }

    @Test
    void update() {
    }

    @Test
    void deleteById() {
    }
}