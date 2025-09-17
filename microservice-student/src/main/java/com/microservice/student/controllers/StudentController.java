package com.microservice.student.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.student.models.Student;
import com.microservice.student.services.IStudentService;


@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping
    public ResponseEntity<?> findAllStudents(){
        return ResponseEntity.ok().body(studentService.findAllStudents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findStudentById(@PathVariable Long id){

        return ResponseEntity.ok(studentService.findById(id));
    }
    @PostMapping("/save")
    
    public ResponseEntity<?> saveStudent(@RequestBody Student s){
        
        studentService.saveStudent(s);
        URI location = studentService.createUri(s, "/{id}");
        return (ResponseEntity<?>) ResponseEntity.created(location).build();

    }

}
