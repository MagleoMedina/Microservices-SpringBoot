package com.microservice.course.services;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.microservice.course.models.Course;
import com.microservice.course.repository.CourseRepository;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseRepository courseRepository;
    
    @Override
    public List<Course> getAllCourses() {
        
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void saveCourse(Course course) {
        
        courseRepository.save(course);
        
    }

    @Override
    public URI createUri(Course c, String path){
        var location = ServletUriComponentsBuilder.
                        fromCurrentRequest().
                        path(path).
                        buildAndExpand(c.getId()).
                        toUri();
        return location;
    }

    

}
