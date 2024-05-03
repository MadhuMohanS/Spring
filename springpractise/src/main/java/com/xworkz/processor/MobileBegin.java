package com.xworkz.processor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobileBegin {
public static void main(String[] args) {
	ApplicationContext mobile=new AnnotationConfigApplicationContext(AppConfig.class);
	Samsung samsung=mobile.getBean(Samsung.class);
	samsung.config();
}
}
