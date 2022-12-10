package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "com.masai")
public class AppConfi {

	
	@Bean
	public B getB() {
		
		B b=new B();
	
		return b;
	}
	
}
