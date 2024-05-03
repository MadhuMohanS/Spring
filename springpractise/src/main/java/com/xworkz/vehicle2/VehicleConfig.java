package com.xworkz.vehicle2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.vehicle2")
public class VehicleConfig {

	@Bean(name="tyre")
	public Tyre getTyre() {
		Tyre tyre=new Tyre();
		tyre.setCompany("Ceat");
		tyre.setCost(3000);
		return tyre;
	}
	
}
