package com.microservice.course.services;

import java.net.URI;
import java.util.List;

import com.microservice.course.http.response.StudentByIdCourseResponse;
import com.microservice.course.models.Course;

public interface ICourseService {

    public List<Course> getAllCourses();
    public Course getCourseById(Long id);
    public void saveCourse(Course course);
    public URI createUri(Course c, String path);
    public StudentByIdCourseResponse getStudentsByCourseId(Long courseId);

}
