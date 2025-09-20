package com.microservice.course.services;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.microservice.course.client.StudentClient;
import com.microservice.course.dto.StudentDTO;
import com.microservice.course.http.response.StudentByIdCourseResponse;
import com.microservice.course.models.Course;
import com.microservice.course.repository.CourseRepository;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentClient studentClient;
    
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

    @Override
    public StudentByIdCourseResponse getStudentsByCourseId(Long courseId) {

        //Retornar los cursos
        Course course = courseRepository.findById(courseId).orElseThrow();
        
        //Retornar los estudiantes
        List<StudentDTO> studentDTOlist = studentClient.findByIdCourse(courseId);

        return StudentByIdCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentsDTOList(studentDTOlist)
                .build();

}
}
