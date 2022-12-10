package com.masai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class A {

	 
	@Autowired
	public B b5;
	
	
	@Autowired
	@Qualifier("getList")
	public List<String> names;
	
	
	public void showA() {
		System.out.println("I am inside showA method of the A class");
		System.out.println("Address Of of the B : "+b5);
		
		for(String s:names) {
			
			System.out.println(s);
			
		}
		

	}
	
	
	
}
