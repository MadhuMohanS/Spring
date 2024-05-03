package com.xworkz.springjdbc.repo;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.xworkz.springjdbc.dto.StudentDto;

public class StudentRepoImpl implements StudentRepo{

	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int save(StudentDto studentDto) {
		// TODO Auto-generated method stub
		String query="insert into student values(?,?,?)";
	int r=	jdbcTemplate.update(query,studentDto.getId(),studentDto.getName(),studentDto.getCity());
		return r;
	}
	public StudentDto find(int id) {
		// TODO Auto-generated method stub
		String query="select * from student where id=?";
		RowMapper<StudentDto> rowMapper=new RowMapperImpl();
	StudentDto studentDto2=	jdbcTemplate.queryForObject(query, rowMapper,id);
		return studentDto2;
	}
	public int update(StudentDto studentDto) {
		// TODO Auto-generated method stub
		String query="update Student set name=?,city=? where id=?";
		int r= jdbcTemplate.update(query,studentDto.getName(),studentDto.getCity(),studentDto.getId());
		return r;
	}
	public int delete(StudentDto studentDto) {
		// TODO Auto-generated method stub
		String query="delete from student where id=?";
		int r =jdbcTemplate.update(query,studentDto.getId());
		return r;
	}
	public List<StudentDto> findAll() {
		// TODO Auto-generated method stub
		String query="select * from student";
	List<StudentDto> studentDtos=	jdbcTemplate.query(query, new RowMapperImpl());
		return studentDtos;
	}

}
