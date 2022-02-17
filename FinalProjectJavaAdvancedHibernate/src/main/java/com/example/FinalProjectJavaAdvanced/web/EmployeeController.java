package com.example.FinalProjectJavaAdvanced.web;

import com.example.FinalProjectJavaAdvanced.models.Employee;
import com.example.FinalProjectJavaAdvanced.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    /**
     * Controller class for the table Employee that has the CRUD implementation.
     */

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public Iterable<Employee> findAll(@RequestParam(required = false, value = "name") String name) {
        if (name != null) {
            return employeeService.findByName(name);
        }
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") Long id) {
        return employeeService.findById(id);
    }

    @PostMapping("/{id}")
    public Employee createEmployee(@RequestBody Employee employee, @PathVariable("id") Long id) {
        return employeeService.createEmployee(employee, id);
    }

    @PutMapping("/{id}/{idDepartment}")
    public Employee update(@PathVariable("id") Long id, @PathVariable("idDepartment") Long idDepartment, @RequestBody Employee employee) {
        return employeeService.update(employee, id, idDepartment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        employeeService.deleteById(id);
    }
}
