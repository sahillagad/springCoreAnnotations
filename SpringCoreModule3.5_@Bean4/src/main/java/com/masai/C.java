package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class C {

	@Bean
	public B getB() {
	 
	System.err.println("I am Method That Return Type Is B Object");	
	B b=new B();
	return b;
 
	}
		
		
	public void showC() {
		System.out.println("You call The ShowC Method Of the Class");
		
		
	}
		
		
		
}
