package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.example.demo.entity.Address;
import com.example.demo.entity.CabDriver;

@Configuration
public class ApplicationConfig {

	@Bean()
	@Lazy
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public CabDriver driverRamesh() {
		System.out.println("inside factory");
		return new CabDriver(101,"Ramesh",4.3,/*address()*/"Chennai");
	}
//	@Bean()
//	public Address address() {
//		return new Address("dfdf","negr","chennai",1213);
//	}
	
	@Bean()
	public Address address() {
		return new Address("30","g block","mumbai",1213);
	}
	
	@Bean()
	public DataSource dataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/Test");
		dataSource.setUsername("root");
		dataSource.setPassword("mysql.ks18@@");
		return dataSource;
	}
	
	@Bean()
	public JdbcTemplate template() {
		return new JdbcTemplate(dataSource());
	}
}
