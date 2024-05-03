package springpractise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TelevisionBegin {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Panasonic obj=(Panasonic) context.getBean("panasonic");
	obj.display();
	
//	Screen screen=(Screen)context.getBean("screen");
//	System.out.println(screen);
}
}
