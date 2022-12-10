package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	
	public static void main(String[] args) {
		
		
		ApplicationContext ap=new AnnotationConfigApplicationContext(Appconfi.class);
		
		Employee employee=(Employee) ap.getBean("employee");
		
		employee.showE();
		
		
		
	}

	
}
