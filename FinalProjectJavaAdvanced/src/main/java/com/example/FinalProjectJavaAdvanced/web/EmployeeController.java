package com.example.FinalProjectJavaAdvanced.web;

import com.example.FinalProjectJavaAdvanced.models.Department;
import com.example.FinalProjectJavaAdvanced.models.Employee;
import com.example.FinalProjectJavaAdvanced.services.DepartmentService;
import com.example.FinalProjectJavaAdvanced.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public Iterable<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") Long id) {
        return employeeService.findById(id);
    }

    @PostMapping("/")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable("id") Long id, @RequestBody Employee employee) {
        return employeeService.update(employee, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        employeeService.deleteById(id);
    }
}
