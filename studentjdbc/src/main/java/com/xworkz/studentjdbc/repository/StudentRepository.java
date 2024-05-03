package com.xworkz.studentjdbc.repository;

import java.util.List;

import com.xworkz.studentjdbc.dto.StudentDto;

public interface StudentRepository {
public int save(StudentDto studentDto);
public int saveAll(List<StudentDto> studentDtos);
public int update(StudentDto studentDto);
public int delete(StudentDto studentDto);
public StudentDto find(int id);
public List<StudentDto> findAll();
}
