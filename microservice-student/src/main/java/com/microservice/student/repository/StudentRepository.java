package com.microservice.student.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.microservice.student.models.Student;

@Repository                                              //Tabla    PK
public interface StudentRepository extends CrudRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.courseId = :courseId")//no dejar espacios pero en fa
    List<Student> findByIdCourse(Long courseId);    

    //List<Student> findByIdCourse(Long courseId);

}
