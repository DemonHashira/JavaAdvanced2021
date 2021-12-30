package com.example.lecture14.controllers;


import com.example.lecture14.exception.StudentException;
import com.example.lecture14.model.ErrorDetails;
import com.example.lecture14.model.Student;
import com.example.lecture14.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    public ResponseEntity<?> listAll() {
            return ResponseEntity
                    .status(200)
                    .header("ExampleHeader", "Viktor")
                    .body(studentService.findAll());
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<?> getStudent(@PathVariable int id) {
            return ResponseEntity.ok().body(studentService.findById(id));
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        student= studentService.addStudent(student);
        return student;
    }
}
