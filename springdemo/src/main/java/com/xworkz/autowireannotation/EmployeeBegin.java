package com.xworkz.autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeBegin {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/xworkz/autowireannotation/autoconfig.xml");
	Employee employee= context.getBean("emp",Employee.class);
	System.out.println(employee);
}
}
