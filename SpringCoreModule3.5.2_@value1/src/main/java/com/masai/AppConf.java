package com.masai;

import javax.annotation.ManagedBean;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai") 
public class AppConf {

	
	  @Bean
	    public DataSource dataSource()
	    {
	        dataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
	        dataSourceBuilder.driverClassName("org.h2.Driver");
	        dataSourceBuilder.url("jdbc:h2:file:C:/temp/test");
	        dataSourceBuilder.username("sa");
	        dataSourceBuilder.password("");
	        return dataSourceBuilder.build();
	    }
	
}
