package com.xworkz.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleBegin {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Vehicle obj=(Vehicle) context.getBean("vehicle");
	
	Tyre tyre=(Tyre)context.getBean("tyre");
	obj.drive();
//	System.out.println(tyre);
}
}
