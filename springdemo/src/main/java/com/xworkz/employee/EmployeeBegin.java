package com.xworkz.employee;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeBegin {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/xworkz/employee/empconfig.xml");
	Employee employee=(Employee) context.getBean("employee");
	System.out.println(employee.getName());
	System.out.println(employee.getAddresses());
	System.out.println(employee.getCourses());
	System.out.println(employee.getPhones());
	
	Set<String> addressSet= employee.getAddresses();
	addressSet.stream().filter(x->x.equals("Davangere")).forEach(s->System.out.println(s));
}
}
