package com.microservice.student.services;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.microservice.student.models.Student;
import com.microservice.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
    private StudentRepository studentRepository;

    

    @Override
    public List<Student> findAllStudents() {
        
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Student> findByIdCourse(Long courseId) {
        
        return studentRepository.findByIdCourse(courseId);//okl
    }

    @Override
    public void saveStudent(Student s) {
        studentRepository.save(s);
        
    }

    @Override
    public URI createUri(Student s, String path){
        var location = ServletUriComponentsBuilder.
                        fromCurrentRequest().
                        path(path).
                        buildAndExpand(s.getId()).
                        toUri();
        return location;
    }

    

}
