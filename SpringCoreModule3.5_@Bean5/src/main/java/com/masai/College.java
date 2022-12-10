package com.masai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class College {


	 @Autowired
     private String collegeName;

    @Autowired
	private List<Student> students;

    
    public void showCollege() {
    
    	System.out.println("I AM INSIDE THE SHOWCOLLEGE() METHOD OF  COLLEGE");
    	
    	System.out.println("College Name : "+collegeName);
    	
    	int count=1;
    	for(Student student:students) {
    
    		System.out.println(count+" = "+student);
    	
    		count++;
    	}
    	
    	
    	
    	
    }
    
    
    
	
	
	

}
