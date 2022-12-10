package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DBUTILITY {

	@Value("${db.driverName}")
	private String DriveName;
	
	
	@Value("${db.url}")
	private String url;
	
	@Value("${db.username}")
	private String Username;
	
	@Value("${db.password}")
	private String password;
	
	@Bean
	public  Connection provideconnection() { 	
		Connection conn=null;
		
		
		
		try {
			Class.forName(DriveName);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		
		}
		

		
		try {
			 conn=DriverManager.getConnection(url,Username,password);
	 

		
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return conn;
		
		
		
		
		
	
	}
}
