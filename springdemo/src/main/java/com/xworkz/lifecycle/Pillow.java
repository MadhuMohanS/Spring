package com.xworkz.lifecycle;

public class Pillow {
private int price;

public Pillow() {
	System.out.println("rnning no-arg constructor of pillow");
}

public Pillow(int price) {
	super();
	this.price = price;
}

@Override
public String toString() {
	return "Pillow [price=" + price + "]";
}

public int getPrice() {
	System.out.println("getting price");
	return price;
	
}

public void setPrice(int price) {
	this.price = price;
	System.out.println("setting price");
}

public void init() {
	System.out.println("running init method");
}
public void destroy() {
	System.out.println("running destroy method");
}
}
