package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai1.C;

@Service
public class A {

 @Autowired
 private B b;
 
 @Autowired
 private C c;
 
 
 
  public void showA() {
	 System.out.println("I am inside the A class"); 
	 System.out.println("B Object : "+b);
	 System.out.println("C Object : "+c);
     
  
  }

  
  public void AllShow() {
	  
	  System.err.println("-------- AllShow() Method---------");
	  b.showB();
	  c.showC();
  }
  
	
	
	
}
