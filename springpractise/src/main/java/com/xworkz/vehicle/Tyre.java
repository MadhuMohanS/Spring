package com.xworkz.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
private String brand;
private double cost;
//public String getBrand() {
//	return brand;
//}
//public void setBrand(String brand) {
//	this.brand = brand;
//}

//public Tyre(String brand) {
//	this.brand=brand;
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
