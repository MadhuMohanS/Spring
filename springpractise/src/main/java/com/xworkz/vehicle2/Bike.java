package com.xworkz.vehicle2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Bike implements Vehicle{

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("running drive method in Bike");
		
	}

}
