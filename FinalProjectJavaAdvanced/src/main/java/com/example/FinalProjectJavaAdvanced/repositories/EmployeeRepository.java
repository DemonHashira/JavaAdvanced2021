package com.example.FinalProjectJavaAdvanced.repositories;

import com.example.FinalProjectJavaAdvanced.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
