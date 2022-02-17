package com.example.FinalProjectJavaAdvanced.services;

import com.example.FinalProjectJavaAdvanced.models.Department;
import com.example.FinalProjectJavaAdvanced.models.Employee;
import com.example.FinalProjectJavaAdvanced.repositories.DepartmentRepository;
import com.example.FinalProjectJavaAdvanced.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.mockito.Mockito.when;

@SpringBootTest
class DepartmentServiceTest {

    /**
     * Test for department service class.
     */

    @MockBean
    private DepartmentRepository departmentRepository;

    @MockBean
    private EmployeeRepository employeeRepository;

    @Test
    void findAll() {
    }

    @Test
    void createDepartment() {
        Department department = new Department();
        department.setDepartment_id(1L);
        department.setName("Test");
        department.setSumOfSalary(5000);

        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Viktor");
        employee.setLastName("Logodazhki");
        employee.setAddress("Preslav");
        employee.setSalary(5000);
        employee.setDepartment(department);
        department.employeeArrayList.add(employee.getName());

        when(departmentRepository.findById(1L)).thenReturn(Optional.of(department));
    }

    @Test
    void findById() {
    }

    @Test
    void update() {
    }

    @Test
    void deleteById() {
    }
}