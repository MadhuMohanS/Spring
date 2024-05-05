package com.xworkz.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonBegin {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/xworkz/constructor/constructorconfig.xml");
	Person person=(Person) context.getBean("person");
	System.out.println(person);
	
	Addition addition=(Addition) context.getBean("add");
	addition.doSum();
}
}
