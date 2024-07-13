package com.boot.Spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn AWS", "Abdullah"),
                new Course(2,"Learn Rest", "Guy"),
                new Course(3,"Learn Hibernate", "Guy"),
                new Course(3,"Learn Hibernate", "Guy"),
                new Course(3,"Learn Hibernate", "Guy")
        );
    }
}
