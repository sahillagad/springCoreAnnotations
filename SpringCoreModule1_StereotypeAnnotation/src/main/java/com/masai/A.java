package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {

	
	@Autowired
	private B b; 
	 
	
	
	public void showA() {
		System.out.println("I am inside the showA Method Of the A class");
		
		System.out.println("I am Call the B Show Method");
		 b.showB();
		
		
	}
	
}
