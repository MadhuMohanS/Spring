package com.xworkz.springanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	@Autowired
	@Qualifier("snapdragon")
	MobileProcessor cpu;
	
public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

public void config() {
	System.out.println("Ram:8gb,12mp camera,Black Color");
	cpu.processor();
	
}
}
