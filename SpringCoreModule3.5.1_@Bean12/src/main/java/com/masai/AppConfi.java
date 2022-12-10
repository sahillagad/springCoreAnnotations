package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class AppConfi {

	   
	@Bean
	public B getB() {
		
		B b=new B();
		return b;
	}
	
	
	@Bean
	public List<Student> getStudent(){
		List<Student> list=new ArrayList<>();
		
		list.add(new Student(1,"s1",567));
		list.add(new Student(2,"s2",667));
		list.add(new Student(3,"s3",427));
		list.add(new Student(4,"s4",762));
		list.add(new Student(5,"s5",457));
		list.add(new Student(6,"s6",400));
		
		return list;
		
	}
	
	
}
