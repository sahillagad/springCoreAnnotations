package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {

	@Autowired
	public B b1;
	
	
	
	public void showA() {

    System.err.println("I am inside the showA method of the A Class"); 
				
	 b1.showB();	
	 System.out.println("B Object Address : "+b1);
	
	}
	
	
}
