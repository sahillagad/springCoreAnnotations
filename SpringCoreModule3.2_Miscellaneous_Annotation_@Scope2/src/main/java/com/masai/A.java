package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class A {
 
	@Autowired
	private B b;
	
	
	public void showA() {
	System.out.println("I am inside the showA method of the A class");
		
    	b.showB();	
		 
		
	}
	
	
	
}
