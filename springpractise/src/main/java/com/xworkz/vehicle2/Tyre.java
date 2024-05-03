package com.xworkz.vehicle2;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	private String company;
	private double cost;
public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
public void skate() {
	System.out.println("running skate in Tyre");
}
}
