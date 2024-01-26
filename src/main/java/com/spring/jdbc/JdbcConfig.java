package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {
@Bean("ds")
public DriverManagerDataSource getDataSource()
{
	DriverManagerDataSource ds= new DriverManagerDataSource();
	 ds.setDriverClassName("com.mysql.jdbc.Driver");
	 ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
	 ds.setUsername("root");
	 ds.setPassword("Devendra@0314");
	return ds;
}	 
		 
}
           

