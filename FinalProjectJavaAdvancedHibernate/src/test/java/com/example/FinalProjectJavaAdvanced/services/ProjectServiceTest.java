package com.example.FinalProjectJavaAdvanced.services;

import com.example.FinalProjectJavaAdvanced.models.Department;
import com.example.FinalProjectJavaAdvanced.models.Project;
import com.example.FinalProjectJavaAdvanced.repositories.DepartmentRepository;
import com.example.FinalProjectJavaAdvanced.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.mockito.Mockito.when;

@SpringBootTest
class ProjectServiceTest {

    /**
     * Test for project service class.
     */

    @MockBean
    private ProjectRepository projectRepository;

    @MockBean
    private DepartmentRepository departmentRepository;

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void findByName() {
    }

    @Test
    void createProject() {
        Department department = new Department();
        department.setDepartment_id(1L);
        department.setName("Test");
        department.setSumOfSalary(5000);
        when(departmentRepository.findById(1L)).thenReturn(Optional.of(department));

        Project project = new Project(1L, "GameProject", department);
        when(projectRepository.findById(project.getId())).thenReturn(Optional.of(project));
    }

    @Test
    void update() {
    }

    @Test
    void deleteById() {
    }
}