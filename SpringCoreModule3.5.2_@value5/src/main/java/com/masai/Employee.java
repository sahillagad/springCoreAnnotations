package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class Employee {

	
	@Autowired
	private Environment en;
	
    
   public void showE() {
	   
	   
	   System.err.println("I AM INSIDE ShowE() MEthod Of Employee Class");
	   
	   System.out.println("Employee ID : "+en.getProperty("eid"));
	   System.out.println("NAME : "+en.getProperty("name")  );
	   System.out.println("Marks : "+en.getProperty("salary"));
	   
	   
	   
   }
	
	
	
	
}
