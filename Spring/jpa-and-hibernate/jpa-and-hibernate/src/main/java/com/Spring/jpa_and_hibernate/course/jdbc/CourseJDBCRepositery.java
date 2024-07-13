package com.Spring.jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public class CourseJDBCRepositery {
    @Autowired
    private JdbcTemplate springJDBC;
    private static String INSERT_QUERY =
            """
            INSERT INTO course(id,name,author)
            values(?,?,?);
            """;

    private static String DELETE_QUERY =
            """
            DELETE FROM course
            WHERE id = ?
            """;

    private static String SELECT_QUERY =
            """
            SELECT * FROM course
            WHERE id = ?
            """;
    public void insert(Course course){
        springJDBC.update(INSERT_QUERY,
                course.getId(),
                course.getName(),
                course.getAuthor());
    }

    public void deleteByID(Course course){
        springJDBC.update(DELETE_QUERY,
                course.getId());
    }

    public Course selectQueryByID(int id){
        return springJDBC.queryForObject(SELECT_QUERY
                , new BeanPropertyRowMapper<>(Course.class), id);
    }

}
