package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai") 
public class AppConf {

	
	
	@Bean
	public String getCollegeName() {
		
		String collegeName="Birla college";
		
		return collegeName;
		
	}
	
	@Bean
	public List<Student> getAllStudent(){
		
		List<Student>  list=new ArrayList<>();
		list.add(new Student(1,"sahil",566));
		list.add(new Student(2,"ram",650));
		list.add(new Student(3,"rani",490));
		list.add(new Student(4,"raj",645));
		
		return list;
		
	}
}

