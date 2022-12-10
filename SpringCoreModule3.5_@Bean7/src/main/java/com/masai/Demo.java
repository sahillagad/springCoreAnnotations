package com.masai;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
	ApplicationContext ap=new AnnotationConfigApplicationContext(AppConf.class);	
		
	B  b=(B) ap.getBean("getB");
    
	b.showB();
    
	
	System.out.println(b.getClass());
    
	
	List<String> list=(List<String>) ap.getBean("getListString");
    for(String s:list) {
    	System.out.println(s);
    	
    }
	
	System.out.println(list.getClass() );
    
	}
}
