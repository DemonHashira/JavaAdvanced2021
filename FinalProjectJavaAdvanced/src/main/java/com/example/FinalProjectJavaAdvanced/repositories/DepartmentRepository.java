package com.example.FinalProjectJavaAdvanced.repositories;

import com.example.FinalProjectJavaAdvanced.models.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, String> {

}
