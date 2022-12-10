package com.masai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class A {

	
	
	@Autowired
	 private B b5;
	
	
	
	@Autowired 
	private List<Student> list;
	

	public void showA() {
		System.out.println("I AM INSIDE THE SHOWA() METHOD IN A CLASS");
		
		
		
		System.out.println("Address of B : "+b5);
		
		for(Student stud:list) {
			 
			System.out.println(stud);
		
		}
		
		
	}
	
	
}
