package com.Spring.jpa_and_hibernate.course.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringJPARepositery extends JpaRepository <Course,Long>{
    List<Course> findbyAge(String name);
}
