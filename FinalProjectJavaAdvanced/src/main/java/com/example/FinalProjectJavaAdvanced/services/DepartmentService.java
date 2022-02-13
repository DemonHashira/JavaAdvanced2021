package com.example.FinalProjectJavaAdvanced.services;

import com.example.FinalProjectJavaAdvanced.exception.WrongArguments;
import com.example.FinalProjectJavaAdvanced.models.Department;
import com.example.FinalProjectJavaAdvanced.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Iterable<Department> findAll() {
        return departmentRepository.findAll();
    }

    public Department CreateDepartment(Department department) {
        if (department.getName() == null || department.getName().isBlank()) {
            throw new WrongArguments();
        }
        return departmentRepository.save(department);
    }
}
