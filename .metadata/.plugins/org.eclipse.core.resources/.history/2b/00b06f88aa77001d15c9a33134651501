package com.masai.Usecase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.Presentaion.AddStudent;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
	   AddStudent addStudent=(AddStudent)ap.getBean("addStudent");
		
	    addStudent.showAddStudent();
		
		
		
	}
}
