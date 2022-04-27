package com.example.demo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperBoy implements RowMapper<Boy> {

    @Override
    public Boy mapRow(ResultSet rs, int rowNum) throws SQLException {
        Boy boy = new Boy(rs.getNString("name"), rs.getNString("surname"));
        return boy;
    }
}
