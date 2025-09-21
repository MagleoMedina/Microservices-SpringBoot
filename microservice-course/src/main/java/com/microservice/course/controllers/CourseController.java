package com.microservice.course.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.course.models.Course;
import com.microservice.course.services.ICourseService;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/courses")

public class CourseController {

    @Autowired
    private ICourseService courseService;

    @GetMapping
    public ResponseEntity<?> getAllCourses() {
        try {
            return ResponseEntity.ok(courseService.getAllCourses());
        } catch (Exception e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity<?> createCourse(@RequestBody Course course) {
        try {
            URI location = courseService.createUri(course, "/{id}");
            return (ResponseEntity<?>) ResponseEntity.created(location).build();
        } catch (Exception e) {
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCourseById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(courseService.getCourseById(id));
        } catch (Exception e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }

    @GetMapping("/search-students/{courseId}")
    public ResponseEntity<?> getStudentsByCourseId(@PathVariable Long courseId) {
        try {
            return ResponseEntity.ok(courseService.getStudentsByCourseId(courseId));
        } catch (Exception e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }

}
