package com.Spring.jpa_and_hibernate;

import com.Spring.jpa_and_hibernate.course.jdbc.Course;
import com.Spring.jpa_and_hibernate.course.jdbc.CourseJDBCRepositery;
import com.Spring.jpa_and_hibernate.course.jdbc.CourseJdbcCommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class JpaAndHibernateApplication {

	public static void main(String[] args) {

		SpringApplication.run(JpaAndHibernateApplication.class, args);


		var context = new AnnotationConfigApplicationContext(JpaAndHibernateApplication.class);


	}
}
