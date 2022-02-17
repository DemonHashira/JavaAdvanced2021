package com.example.FinalProjectJavaAdvanced.web;

import com.example.FinalProjectJavaAdvanced.models.Project;
import com.example.FinalProjectJavaAdvanced.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("project")
public class ProjectController {

    /**
     * Controller class for the table Project that has the CRUD implementation.
     */

    @Autowired
    private ProjectService projectService;

    @GetMapping("/")
    public Iterable<Project> findAll(@RequestParam(required = false, value = "name") String name) {
        if (name != null) {
            return projectService.findByName(name);
        }
        return projectService.findAll();
    }

    @GetMapping("/{id}")
    public Project findById(@PathVariable("id") Long id) {
        return projectService.findById(id);
    }


    @PostMapping("/{id}")
    public Project createProject(@RequestBody Project project, @PathVariable("id") Long id) {
        return projectService.createProject(project, id);
    }

    @PutMapping("/{id}/{idDepartment}")
    public Project update(@PathVariable("id") Long id, @RequestBody Project project, @PathVariable("idDepartment") Long idDepartment) {
        return projectService.update(project, id, idDepartment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        projectService.deleteById(id);
    }
}
