package com.xworkz.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentBegin {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/xworkz/stereotype/studentconfig.xml");
//	Student student= context.getBean("student",Student.class);
//	System.out.println(student);
//	System.out.println(student.getAddress());
//	System.out.println(student.getAddress().getClass().getName());
//	System.out.println(student.hashCode());
//	
//	Student student2= context.getBean("student",Student.class);
//	System.out.println(student2.hashCode());
	Teacher teacher= context.getBean("teacher",Teacher.class);
	System.out.println(teacher.hashCode());
	
	Teacher teacher2= context.getBean("teacher",Teacher.class);
	System.out.println(teacher2.hashCode());
	
}
}
