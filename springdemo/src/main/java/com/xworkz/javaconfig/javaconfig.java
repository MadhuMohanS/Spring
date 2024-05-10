package com.xworkz.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.xworkz.javaconfig")
public class javaconfig {

	@Bean(name={"student","temp","doop"})
	public Student getStudent() {
		return new Student(getSamosa());
	}
	
	public Samosa getSamosa() {
	    return new Samosa();
	}
}
