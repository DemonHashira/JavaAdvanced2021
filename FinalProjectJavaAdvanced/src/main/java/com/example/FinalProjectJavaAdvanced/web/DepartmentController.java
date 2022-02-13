package com.example.FinalProjectJavaAdvanced.web;

import com.example.FinalProjectJavaAdvanced.models.Department;
import com.example.FinalProjectJavaAdvanced.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/department")
    public Iterable<Department> findAll() {
        return departmentService.findAll();
    }

    @PostMapping("/department")
    public Department CreateDepartment(@RequestBody Department department) {
        return departmentService.CreateDepartment(department);
    }
}
