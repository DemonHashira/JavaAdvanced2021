package com.example.FinalProjectJavaAdvanced.services;

import com.example.FinalProjectJavaAdvanced.exception.EntityDoesNotExist;
import com.example.FinalProjectJavaAdvanced.exception.WrongArguments;
import com.example.FinalProjectJavaAdvanced.models.Employee;
import com.example.FinalProjectJavaAdvanced.models.Project;
import com.example.FinalProjectJavaAdvanced.repositories.EmployeeRepository;
import com.example.FinalProjectJavaAdvanced.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Iterable<Project> findAll() {
        return projectRepository.findAll();
    }

    public Project findById(Long id) {
        if(id == null || id <= 0L ){
            throw new WrongArguments();
        } else {
            Optional<Project> foundProject = projectRepository.findById(id);
            if(foundProject.isPresent()){
                return foundProject.get();
            }else {
                throw new EntityDoesNotExist();
            }
        }
    }

    public Project createProject(Project project) {
        if (project.getName() == null || project.getName().isBlank()) {
            throw new WrongArguments();
        }
        return projectRepository.save(project);
    }

    public Project update(Project project, Long id) {
        Project foundProject = findById(id);
        foundProject.setDepartment(project.getDepartment());
        foundProject.setName(project.getName());
        projectRepository.save(foundProject);
        return foundProject;
    }

    public void deleteById(Long id) {
        projectRepository.deleteById(id);
    }

}
