package com.microservice.course.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.course.dto.StudentDTO;


@FeignClient(name="msvc-student", url = "127.0.0.1:8090/api/students")
public interface StudentClient {

    @GetMapping("/search-by-id/{idCourse}")
    List<StudentDTO> findByIdCourse(@PathVariable Long idCourse);

}
