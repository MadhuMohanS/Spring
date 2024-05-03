package com.xworkz.springjdbc.runner;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.xworkz.springjdbc.dto.StudentDto;
import com.xworkz.springjdbc.repo.StudentRepo;
import com.xworkz.springjdbc.repo.StudentRepoImpl;

public class StudentBegin {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml"); 
	StudentRepo studentRepo= context.getBean(StudentRepoImpl.class);
//	StudentDto studentDto=(StudentDto) context.getBean("studentDto");
//	studentDto.setId(4);
//	studentDto.setName("Anushka");
//	studentDto.setCity("Manglore");
//	int r= studentRepo.save(studentDto);
//	System.out.println("no of rows inserted are:"+r);
//	
//	StudentDto studentDto2=(StudentDto) context.getBean("studentDto");
//	studentDto2.setName("Mohan");
//	studentDto2.setCity("Manglore");
//	studentDto2.setId(1);
//	int re =studentRepo.update(studentDto2);
//	System.out.println("no of rows updated:"+re);
	
//	StudentDto studentDto3=(StudentDto)context.getBean("studentDto");
//	studentDto3.setId(1);
//	int re=  studentRepo.delete(studentDto3);
//	System.out.println("no of rows deleted:"+re);
//	StudentDto studentDto= studentRepo.find(2);
//	System.out.println(studentDto);
	
	List<StudentDto> studentDtos= studentRepo.findAll();
	for(StudentDto studentDto:studentDtos) {
		System.out.println(studentDto.getId());
		System.out.println(studentDto.getCity());
		System.out.println(studentDto.getName());
	}
}
}
