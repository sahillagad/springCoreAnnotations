package com.masai;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
	ApplicationContext ap=new AnnotationConfigApplicationContext(AppConf.class);	
 
	A a=(A) ap.getBean("a");
	a.showA();
	
	}
	}