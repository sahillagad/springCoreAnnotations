package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {

	@Autowired
	private B b5;
	
	
	public void showA() {
		System.out.println("I am Inside the ShowA of the A class");
		System.out.println("B Object : "+b5);
		
		System.err.println("--------------------------");
		 b5.showB();
		
	}
	
}
