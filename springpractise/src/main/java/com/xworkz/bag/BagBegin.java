package com.xworkz.bag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BagBegin {
public static void main(String[] args) {
	ApplicationContext factory=new AnnotationConfigApplicationContext(BagConfig.class);
	Globus globus=factory.getBean(Globus.class);
	globus.materials();
}
}
