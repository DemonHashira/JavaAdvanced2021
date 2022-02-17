package com.example.FinalProjectJavaAdvanced.services;

import com.example.FinalProjectJavaAdvanced.exception.EntityDoesNotExist;
import com.example.FinalProjectJavaAdvanced.exception.WrongArguments;
import com.example.FinalProjectJavaAdvanced.models.Department;
import com.example.FinalProjectJavaAdvanced.models.Project;
import com.example.FinalProjectJavaAdvanced.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectService {

    /**
     * Service class for the table Project that has the CRUD logic.
     */

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private DepartmentService departmentService;

    public Iterable<Project> findAll() {
        return projectRepository.findAll();
    }

    public Project findById(Long id) {
        if (id == null || id <= 0L) {
            throw new WrongArguments();
        } else {
            Optional<Project> foundProject = projectRepository.findById(id);
            if (foundProject.isPresent()) {
                return foundProject.get();
            } else {
                throw new EntityDoesNotExist();
            }
        }
    }

    public Iterable<Project> findByName(String name) {
        return projectRepository.findByName(name);
    }

    public Project createProject(Project project, Long id) {
        if (project.getName() == null || project.getName().isBlank()) {
            throw new WrongArguments();
        }
        Department projectDepartment = departmentService.findById(id);
        project.setDepartment(projectDepartment);
        return projectRepository.save(project);
    }

    public Project update(Project project, Long idProject, Long idDepartment) {
        Department updatedProjectDepartment = departmentService.findById(idDepartment);
        Project foundProject = findById(idProject);
        foundProject.setDepartment(updatedProjectDepartment);
        foundProject.setName(project.getName());
        projectRepository.save(foundProject);
        return foundProject;
    }

    public void deleteById(Long id) {
        projectRepository.deleteById(id);
    }
}
