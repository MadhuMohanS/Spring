package com.xworkz.justspring;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AlienBegin {
public static void main(String[] args) {
	BeanFactory factory=new ClassPathXmlApplicationContext("spring.xml");
	Alien alien=(Alien) factory.getBean("alien");
	alien.code();	
}
}
