package com.boot.Spring;

public class Course {


    private int id;
    private String className;
    private String author;

    public Course(int id, String className, String author) {
        this.id = id;
        this.className = className;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
