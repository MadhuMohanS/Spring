package com.xworkz.springjdbc.dto;

import org.springframework.stereotype.Component;


public class StudentDto {
private int id;
private String name;
private String city;

public StudentDto() {
	System.out.println("running no-arg constructor of studentdto");
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public StudentDto(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}
@Override
public String toString() {
	return "StudentDto [id=" + id + ", name=" + name + ", city=" + city + "]";
}


}
