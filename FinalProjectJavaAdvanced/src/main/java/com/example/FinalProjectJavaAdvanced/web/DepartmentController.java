package com.example.FinalProjectJavaAdvanced.web;

import com.example.FinalProjectJavaAdvanced.models.Department;
import com.example.FinalProjectJavaAdvanced.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/")
    public Iterable<Department> findAll() {
        return departmentService.findAll();
    }

    @PostMapping("/")
    public Department CreateDepartment(@RequestBody Department department) {
        return departmentService.CreateDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable("id") Long id) {
        return departmentService.findById(id);
    }

    @PutMapping("/{id}")
    public Department update(@PathVariable("id") Long id, @RequestBody Department department) {
        return departmentService.update(department,id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        departmentService.deleteById(id);
    }
}
