package com.xworkz.studentjdbc.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.xworkz.studentjdbc.dto.StudentDto;

@Component
public class StudentRepositoryImpl implements StudentRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int save(StudentDto studentDto) {
		// TODO Auto-generated method stub
		String sql="insert into student values(?,?,?)";
		int r= jdbcTemplate.update(sql,studentDto.getId(),studentDto.getName(),studentDto.getCity());
		return r;
	}
	public int saveAll(final List<StudentDto> studentDtos) {
		String sql = "insert into student values(?,?,?)";
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                StudentDto object = studentDtos.get(i);
                ps.setInt(1, object.getId());
                ps.setString(2, object.getName());
                ps.setString(3, object.getCity());
                // Set other properties accordingly
            }

            public int getBatchSize() {
                return studentDtos.size();
            }
        });
		return studentDtos.size();
	}
	public int update(StudentDto studentDto) {
		// TODO Auto-generated method stub
		String sql="update student set name=?,city=? where id=?";
	int r=	jdbcTemplate.update(sql,studentDto.getName(),studentDto.getCity(),studentDto.getId());
		return r;
	}
	public int delete(StudentDto studentDto) {
		// TODO Auto-generated method stub
		String sql="delete from student where id=?";
		int r= jdbcTemplate.update(sql,studentDto.getId());
		return r;
	}
	public StudentDto find(int id) {
		// TODO Auto-generated method stub
		String sql="select * from student where id=?";
		RowMapper rowMapper=new RowMapperImpl();
		StudentDto studentDto= jdbcTemplate.queryForObject(sql, rowMapper,id);
		return studentDto;
	}
	public List<StudentDto> findAll() {
		// TODO Auto-generated method stub
		String sql="select * from student";
		List<StudentDto> list= jdbcTemplate.query(sql, new RowMapperImpl());
		return list;
	}

}
