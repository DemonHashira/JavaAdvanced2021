package com.example.FinalProjectJavaAdvanced.services;

import com.example.FinalProjectJavaAdvanced.exception.EntityDoesNotExist;
import com.example.FinalProjectJavaAdvanced.exception.WrongArguments;
import com.example.FinalProjectJavaAdvanced.models.Department;
import com.example.FinalProjectJavaAdvanced.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Department findById(Long id) {
        if(id == null || id <= 0L ){
            throw new WrongArguments();
        } else {
            Optional<Department> foundDepartment = departmentRepository.findById(id);
            if(foundDepartment.isPresent()){
                return foundDepartment.get();
            }else {
                throw new EntityDoesNotExist();
            }
        }
    }

    public Department update(Department department, Long id) {
        Department foundDepartment = findById(id);
        foundDepartment.setName(department.getName());
        departmentRepository.save(foundDepartment);
        return foundDepartment;
    }

    public void deleteById(Long id) {
        departmentRepository.deleteById(id);
    }
}
