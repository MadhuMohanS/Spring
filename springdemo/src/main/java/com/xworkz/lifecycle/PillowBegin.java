package com.xworkz.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PillowBegin {
public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/xworkz/lifecycle/pillowconfig.xml");
	Pillow pillow=(Pillow) context.getBean("pillow");
	System.out.println(pillow);
	context.registerShutdownHook();
	
	Pepsi pepsi=(Pepsi) context.getBean("pepsi");
	System.out.println(pepsi);
	
}
}
