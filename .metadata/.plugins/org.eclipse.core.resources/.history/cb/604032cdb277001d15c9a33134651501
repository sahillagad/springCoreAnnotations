package com.masai;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
	ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");	
		
	 A a=(A)ap.getBean("a");
	 A a1=(A)ap.getBean("a");
	 
		
	 
		System.out.println("Both object is same = "+(a==a1));
		 System.out.println("It give true because it is by default scope is singleton"); 
	      System.out.println("We also give scope as singleton scope "); 	
		
	}
}
