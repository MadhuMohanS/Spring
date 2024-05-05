package com.xworkz.autowire;

public class Address {
private String streetName;
private int streetNo;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(String streetName, int streetNo) {
	super();
	this.streetName = streetName;
	this.streetNo = streetNo;
}
@Override
public String toString() {
	return "Address [streetName=" + streetName + ", streetNo=" + streetNo + "]";
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public int getStreetNo() {
	return streetNo;
}
public void setStreetNo(int streetNo) {
	this.streetNo = streetNo;
}
}
