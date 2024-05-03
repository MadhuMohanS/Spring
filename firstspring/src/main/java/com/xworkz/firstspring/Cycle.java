package com.xworkz.firstspring;

import org.springframework.stereotype.Component;

@Component
public class Cycle implements Vehicle{

	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println("cycle is moving");
		
	}

	@Override
	public String toString() {
		return "Cycle [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
