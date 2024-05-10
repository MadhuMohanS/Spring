package com.xworkz.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpelBegin {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/xworkz/spel/spelconfig.xml");
	Spel spel= context.getBean("spel",Spel.class);
	System.out.println(spel);
}
}
