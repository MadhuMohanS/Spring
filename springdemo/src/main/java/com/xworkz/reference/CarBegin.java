package com.xworkz.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarBegin {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/xworkz/reference/refconfig.xml");
	Car car=(Car) context.getBean("car");
	System.out.println(car);
	System.out.println(car.getTyre().getCost());
}
}
