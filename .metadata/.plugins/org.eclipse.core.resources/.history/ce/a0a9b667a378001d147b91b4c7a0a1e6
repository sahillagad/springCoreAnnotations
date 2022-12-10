package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class A {
	@Autowired
	private Environment en; 
	
	
	public void showA() {
		System.out.println("I am inside the ShowA() method");
		
		System.out.println("Name : "+en.getProperty("name") );
		System.out.println("roll : "+en.getProperty("roll"));
		System.out.println("marks : "+en.getProperty("marks"));
	
		
	}
	
}
