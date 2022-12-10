package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ap=new AnnotationConfigApplicationContext(AppConf.class);
	
		Student  s1=(Student)ap.getBean("student");
		
		System.out.println(s1);
		
		
		
		
	}
}
