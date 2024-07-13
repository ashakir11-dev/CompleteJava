package com.Spring.jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    //private CourseJDBCRepositery repositery;
//    @Autowired
//    private CourseRepositery repositery;
//    public CourseJdbcCommandLineRunner(CourseRepositery repositery) {
//        this.repositery = repositery;
//    }

    @Autowired
    private CourseSpringJPARepositery repositery;

    @Override
    public void run(String... args) throws Exception {
        repositery.save(new Course(1,"Learn Spring JPA", "Udemy"));
        repositery.save(new Course(2,"Learn Spring Boot", "Udemy"));
        repositery.save(new Course(3,"Learn Spring", "Udemy"));

        repositery.deleteById(3l);

        System.out.println(repositery.findById(1l));
        System.out.println(repositery.findAll());
        System.out.println(repositery.findbyAge("Learn Spring JPA"));
    }
}
