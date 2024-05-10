package com.xworkz.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	@Value("Madhu")
private String studentName;
	@Value("Davangere")
private String studentCity;
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	@Value("#{address}")
	private List<String> address;
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentCity() {
	return studentCity;
}
public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", studentCity=" + studentCity + "]";
}
public Student(String studentName, String studentCity) {
	super();
	this.studentName = studentName;
	this.studentCity = studentCity;
}
public Student() {
	System.out.println("running no-arg constructor of student");
}

}
