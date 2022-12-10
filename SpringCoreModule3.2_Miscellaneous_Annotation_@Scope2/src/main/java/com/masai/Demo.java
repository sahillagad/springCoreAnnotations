package com.masai;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
	ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");	
		
	 A a=(A)ap.getBean("a");
	 A a1=(A)ap.getBean("a");
	 
		
	 
		System.out.println("Both object is same = "+(a==a1));
		System.out.println("Here scope is ProtoType"); 
	    System.out.println("ProtoType Scope =====> Every Time WE Call/Pull The SpringBeanObject With Same Id It Will Give Different Object");
	    System.out.println("SingleTon Scope =====> Every Time WE Call/Pull The SpringBeanObject With Same Id It Will Give same Object");
	    
	
	}
}
