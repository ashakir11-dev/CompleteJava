package com.Spring.jpa_and_hibernate.course.jdbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;
@Entity(name="course")
public class Course {
    @Id
    private long id;
    @Column(name="name")
    private String name;

    @Column(name="author")
    private String author;
    private final String DELIMITER = "'";


    private final String tableName = "course";

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Course() {

    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    public String getTableName() {
//        return tableName;
//    }

    @Override
    public String toString() {
        return Long.toString(id) + name + author;
    }
}
