package com.example.FinalProjectJavaAdvanced.repositories;

import com.example.FinalProjectJavaAdvanced.models.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, String> {

}
