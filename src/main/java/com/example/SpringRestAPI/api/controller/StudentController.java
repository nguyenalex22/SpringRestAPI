package com.example.SpringRestAPI.api.controller;

import com.example.SpringRestAPI.api.model.Student;
import com.example.SpringRestAPI.api.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping(value = "/students")
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @GetMapping(value = "/getStudent")
    public Optional<Student> getStudent(@RequestParam Long studentId) {
        return studentRepo.findById(studentId);
    }

    @PostMapping(value = "/addStudent")
    public void addStudent(@RequestBody Student student) {
        studentRepo.save(student);
    }
}
