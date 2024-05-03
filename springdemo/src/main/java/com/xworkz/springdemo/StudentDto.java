package com.xworkz.springdemo;

import java.awt.List;
import java.util.ArrayList;

public class StudentDto {
private int studentId;
private String studentName;
private String studentAddress;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	System.out.println("setting studentid");
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
	System.out.println("setting student name");
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
	System.out.println("setting student address");
}
public StudentDto(int studentId, String studentName, String studentAddress) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
}

public StudentDto() {
	System.out.println("running no-arg constructor of studentdto");
}
@Override
public String toString() {
	return "StudentDto [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
			+ "]";
}
}
