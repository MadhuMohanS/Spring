package com.xworkz.autowire;



public class Employee {
private String name;
private Address address;
public Employee() {
	System.out.println("running no-arg constructor of employee");
	// TODO Auto-generated constructor stub
}
public Employee(String name, Address address) {
	this.name = name;
	this.address = address;
	System.out.println("inside constructor");
}

@Override
public String toString() {
	return "Employee [name=" + name + ", address=" + address + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	System.out.println("setting name");
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	System.out.println("setting address");
	this.address = address;
}
}
