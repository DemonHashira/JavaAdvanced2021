package com.example.FinalProjectJavaAdvanced.services;

import com.example.FinalProjectJavaAdvanced.exception.WrongArguments;
import com.example.FinalProjectJavaAdvanced.models.Employee;
import com.example.FinalProjectJavaAdvanced.models.Project;
import com.example.FinalProjectJavaAdvanced.repositories.EmployeeRepository;
import com.example.FinalProjectJavaAdvanced.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Iterable<Project> findAll() {
        return projectRepository.findAll();
    }

    public Project createProject(Project project) {
        if (project.getName() == null || project.getName().isBlank()) {
            throw new WrongArguments();
        }
        return projectRepository.save(project);
    }
}
