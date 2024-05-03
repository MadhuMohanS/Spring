package com.xworkz.springpractise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("mediatek")
	MobileProcessor mobileProcessor;
	
	
public MobileProcessor getMobileProcessor() {
		return mobileProcessor;
	}


	public void setMobileProcessor(MobileProcessor mobileProcessor) {
		this.mobileProcessor = mobileProcessor;
	}


void config() {
	System.out.println("8gb ram,48mp pixel");
	mobileProcessor.processor();
}
}
