package com.xworkz.vehicle2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Vehicle{

	@Autowired
	Tyre tyre;
	public Tyre getTyre() {
		return tyre;
	}
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("running drive method in Car");
		tyre.skate();
		System.out.println(tyre.getCompany());
		System.out.println(tyre.getCost());
	}

}
