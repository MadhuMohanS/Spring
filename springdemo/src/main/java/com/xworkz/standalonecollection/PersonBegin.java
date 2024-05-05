package com.xworkz.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonBegin {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/xworkz/standalonecollection/standaloneconfig.xml");
	Person person= context.getBean("person",Person.class);
	System.out.println(person.getFriends());
	System.out.println(person.getFriends().getClass().getName());
	
	System.out.println(person.getFeeStructure());
	System.out.println(person.getFeeStructure().getClass().getName());
	
	System.out.println(person.getProperties());
	System.out.println(person.getProperties().getClass().getName());
}
}
