package com.xworkz.reference;

public class Car {
private String color;
private Tyre tyre;
public Car(String color, Tyre tyre) {
	super();
	this.color = color;
	this.tyre = tyre;
}
public Car() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Car [color=" + color + ", tyre=" + tyre + "]";
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Tyre getTyre() {
	return tyre;
}
public void setTyre(Tyre tyre) {
	this.tyre = tyre;
}
}
