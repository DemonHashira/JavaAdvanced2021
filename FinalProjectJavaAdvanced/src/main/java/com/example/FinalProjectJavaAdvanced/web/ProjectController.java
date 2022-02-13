package com.example.FinalProjectJavaAdvanced.web;

import com.example.FinalProjectJavaAdvanced.models.Employee;
import com.example.FinalProjectJavaAdvanced.models.Project;
import com.example.FinalProjectJavaAdvanced.services.EmployeeService;
import com.example.FinalProjectJavaAdvanced.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/project")
    public Iterable<Project> findAll() {
        return projectService.findAll();
    }

    @PostMapping("/project")
    public Project createProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }
}
