package com.microservice.course.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.course.models.Course;

@Repository
public interface CourseRepository extends CrudRepository <Course, Long> {

    

}