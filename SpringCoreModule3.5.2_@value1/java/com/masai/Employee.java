package com.masai;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Employee {

	@Value("1")
	private int EmployeeId;
	
	@Value("Sahil")
	private String name;
	
	
	@Value("50000")
	private int salary;
	
	
	public void showE() {
		System.out.println("I AM INSIDE THE showE Method of Employee class");
		
		System.out.println("Employee Id : "+EmployeeId);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		
	}
	
	
	
}

