package com.xworkz.studentjdbc.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.studentjdbc.config.JdbcConfig;
import com.xworkz.studentjdbc.dto.StudentDto;
import com.xworkz.studentjdbc.repository.StudentRepository;
import com.xworkz.studentjdbc.repository.StudentRepositoryImpl;

public class StudentBegin {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
	StudentRepository studentRepository=(StudentRepository) context.getBean(StudentRepositoryImpl.class);
//	StudentDto studentDto=new StudentDto();
//	studentDto.setId(5);
//	studentDto.setName("Kiran");
//	studentDto.setCity("Davangere");
//	int r= studentRepository.save(studentDto);
//	System.out.println("no of rows inserted:"+r);
	StudentDto studentDto=new StudentDto();
	studentDto.setId(8);
	studentDto.setName("Manoj");
	studentDto.setCity("Hubli");
	
	StudentDto studentDto2=new StudentDto();
	studentDto2.setId(9);
	studentDto2.setName("Mani");
	studentDto2.setCity("Dharwad");
	
	List<StudentDto> list=new ArrayList<StudentDto>();
	list.add(studentDto);
	list.add(studentDto2);
//	int r= studentRepository.saveAll(list);
//	System.out.println("no of rows inserted:"+r);
	
	StudentDto studentDto3=new StudentDto();
	studentDto3.setId(2);
	studentDto3.setName("rajesh");
	studentDto3.setCity("hyderabad");
//    int r=	studentRepository.update(studentDto3);
//    System.out.println("no of rows updated:"+r);
	
	StudentDto studentDto4=new StudentDto();
	studentDto4.setId(0);
//	int r= studentRepository.delete(studentDto4);
//	System.out.println("no of rows deleted:"+r);
//	StudentDto studentDto5= studentRepository.find(2);
//	System.out.println(studentDto5);
	
	List<StudentDto> studentDtos= studentRepository.findAll();
	for(StudentDto studentDto5:studentDtos) {
		System.out.println(studentDto5);
	}
	
	
}
}
