package com.masai;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service 
@Scope("prototype")
public class A {

	
	@Autowired
	private B b;
	
	
	@PostConstruct
	public void initmethod() {
		System.err.println("I AM INSIDE THE InitMeTHOD");
		
		
	}
	
	
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("I AM INSIDE THE PreDestroy Method");
		
	}
	
	
	public void showA() {
	
		System.out.println("I AM INSIDE THE SHOWA() METHOD A CLASS");
	    System.out.println("Address OF  the B "+b); 	
		
	}
	
	
	
}
