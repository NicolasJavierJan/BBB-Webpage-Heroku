package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoysRepo {
    @Autowired
    private JdbcTemplate template;

    public List<Boy> fetchAll() {
       String sql = "select name, surname from boys";
//        RowMapper<Boy> rowMapper = new BeanPropertyRowMapper<>(Boy.class);

       return template.query(sql, new RowMapperBoy());
    }


    public List<Boy> fetchAllSP() {
        String sql = "select name, surname, ID from boys";
        RowMapper<Boy> rowMapper = new BeanPropertyRowMapper<>(Boy.class);
        return template.query(sql, rowMapper);
    }

    public Boy findUserById(int id) {
        String sql = "select name, surname, ID from boys where ID = ?";
        RowMapper<Boy> rowMapper = new BeanPropertyRowMapper<>(Boy.class);
        Boy boy = template.queryForObject(sql, rowMapper, id);
        return boy;
    }
}
