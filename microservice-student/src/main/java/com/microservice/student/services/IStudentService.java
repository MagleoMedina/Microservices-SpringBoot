package com.microservice.student.services;

import java.net.URI;
import java.util.List;

import com.microservice.student.models.Student;

public interface IStudentService {

   public List<Student> findAllStudents();
   
   public Student findById(Long id);
   
   public void saveStudent(Student student);
   //Referencia a otra tabla
   public List<Student> findByIdCourse(Long courseId);

   public URI createUri(Student s, String path);


}
