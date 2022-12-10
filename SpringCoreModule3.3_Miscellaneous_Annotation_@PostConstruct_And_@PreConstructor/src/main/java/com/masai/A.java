package com.masai;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {

	 @Autowired
	 private B b;
	 
	 
	 
	 public void showA() {
		 
		 System.err.println("----------------------Show A Method--------------------------");
		 System.out.println("I am inside the showA Method");
		 System.out.println("B Object Address : "+b);
		 
		 b.showB();
	 }
	 
	 
	 
	 @PostConstruct
	 public void initMeathod() {

		 System.err.println("----------------------inside initMeathod--------------------------");
		 System.out.println("I am inside the InitMethod");
		 System.out.println("This Method Give @PostConstruct annotation");
		 System.out.println("Connection Is aquired"); 
	      
	 }
	 
 
	 
	 @PreDestroy
	 public void destroyMethod() {
		 System.err.println("----------------------inside destroyMethod--------------------------");
		 System.out.println("I am inside the Destroy Method");
		 System.out.println("This Method Give @PreDestroy annotation");
		 System.out.println("Connection IS release");
	 }
	
	 
	 
}
