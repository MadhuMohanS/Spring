package com.xworkz.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

public Pepsi(int price) {
	this.price = price;
}

public Pepsi() {
	System.out.println("running no-arg constructor of pepsi");
	// TODO Auto-generated constructor stub
}

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("running init of pepsi");
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("running destroy of pepsi");
}

}
