package com.masai;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

public static void main(String[] args) {
	
	
	ApplicationContext ap=new AnnotationConfigApplicationContext(App.class);
	
	Connection conn= (Connection)ap.getBean("provideconnection");
	System.out.println(conn);
	
}
	
	
}
