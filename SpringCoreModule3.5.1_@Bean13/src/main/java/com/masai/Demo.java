package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext ap=new  AnnotationConfigApplicationContext(AppConf.class);
         
	 Student s1= (Student)ap.getBean("getStudent");
	 Student s2= (Student)ap.getBean("getStudent");
	 System.out.println("s1  address : "+s1);
	 System.out.println("s2  address : "+s2);
	 
		
	 System.out.println("Both Object Same : "+(s1==s2));
	}
}
