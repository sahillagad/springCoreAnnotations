package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {
 
	@Autowired
	private B b;
	
	
	public void showA() {
	System.out.println("I am inside the showA method of the A class");
		
    	b.showB();	
		 
		
	}
	
	
	
}
