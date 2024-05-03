package com.xworkz.bag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Globus {

	@Autowired
	@Qualifier("cotton")
	Cloth cloth;
	
	public Cloth getCloth() {
		return cloth;
	}

	public void setCloth(Cloth cloth) {
		this.cloth = cloth;
	}

	void materials() {
		System.out.println("color:red,thread:sharp");
		cloth.stitch();
	}
}
