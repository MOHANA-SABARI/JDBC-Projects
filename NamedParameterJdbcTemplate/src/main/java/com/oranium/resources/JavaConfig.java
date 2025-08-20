package com.oranium.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JavaConfig {
	
	@Bean
	public DriverManagerDataSource myDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/java");
		ds.setUsername("root");
		ds.setPassword("Moha12Villan13");
		return ds;
	}
	
	@Bean
	public NamedParameterJdbcTemplate myJdbcTemplate() {
		
		return new NamedParameterJdbcTemplate(myDataSource());
//		return null;
	}
}
