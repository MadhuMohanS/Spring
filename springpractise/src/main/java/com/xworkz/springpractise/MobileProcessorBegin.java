package com.xworkz.springpractise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobileProcessorBegin {
public static void main(String[] args) {
	ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
	Samsung samsung=factory.getBean(Samsung.class);
	samsung.config();
}
}
