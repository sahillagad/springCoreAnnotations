package com.masai.Presentaion;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.masai.Entity.Student;
import com.masai.service.StudentService;
import com.masai.service.StudentServiceImpl;

@Controller
public class AddStudent {

	@Autowired
	private  StudentServiceImpl service;
	
	
	
	
	 
	
	
	public void setService(StudentServiceImpl service) {
		this.service = service;
	}







	public  void  showAddStudent() {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Enter Name");
		String name= sc.next();
		
		
		System.out.println("Enter Marks");
		int rollNo=sc.nextInt();
		
		Student student=new Student(name, rollNo);
 
		 service.addStudent(student); 
	}
}
