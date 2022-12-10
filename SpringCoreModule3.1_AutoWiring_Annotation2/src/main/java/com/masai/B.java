package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class B {

	@Autowired(required = false)
	private C c;
	
	
	
	public void showB() {
		System.err.println("I am inside the showB method Of the B class");
		
		System.out.println("C Object Value is "+c);
		
		
	}
}

