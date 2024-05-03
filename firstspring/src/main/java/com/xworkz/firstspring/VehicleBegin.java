package com.xworkz.firstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleBegin {
public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Vehicle obj=(Vehicle)context.getBean("car");
	obj.Drive();
//	System.out.println(obj);

//	Tyre t=(Tyre)context.getBean("tyre");
//	System.out.println(t);
}
}
