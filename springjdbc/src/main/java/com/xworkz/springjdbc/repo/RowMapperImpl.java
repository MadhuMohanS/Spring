package com.xworkz.springjdbc.repo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.xworkz.springjdbc.dto.StudentDto;

public class RowMapperImpl implements RowMapper<StudentDto>{

	public StudentDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		StudentDto studentDto=new StudentDto();
		studentDto.setId(rs.getInt(1));
		studentDto.setName(rs.getString(2));
		studentDto.setCity(rs.getString(3));
		return studentDto;
	}

}
