package com.xworkz.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("snapdragon")
	MobileProcessor processor;
	
	
public MobileProcessor getProcessor() {
		return processor;
	}


	public void setProcessor(MobileProcessor processor) {
		this.processor = processor;
	}


void config() {
	System.out.println("running config in Samsung");
	System.out.println("ram 8gb,48 mega pixel");
	processor.processor();
}
}
