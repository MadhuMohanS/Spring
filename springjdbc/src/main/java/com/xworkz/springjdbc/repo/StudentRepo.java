package com.xworkz.springjdbc.repo;

import java.util.List;

import com.xworkz.springjdbc.dto.StudentDto;

public interface StudentRepo {
public int save(StudentDto studentDto);
public StudentDto find(int id);
public int update(StudentDto studentDto);
public int delete(StudentDto studentDto);
public List<StudentDto> findAll();
}
