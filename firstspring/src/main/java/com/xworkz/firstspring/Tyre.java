package com.xworkz.firstspring;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
private String brand;
private double cost;



//public void setBrand(String brand) {
//	this.brand=brand;
//}
//public String getBrand() {
//	return brand;
//}

public double getCost() {
	return cost;
}


public void setCost(double cost) {
	this.cost = cost;
}


@Override
public String toString() {
	return "its working";
}





}
