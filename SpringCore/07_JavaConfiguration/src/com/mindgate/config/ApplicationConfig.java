package com.mindgate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

@Configuration
@ComponentScan("com.mindgate.pojo")
public class ApplicationConfig {

//	@Bean 
//	public Address address(){
//		System.out.println("Address method of ApplicationConfig");
//		Address address=new Address();
//		return address;
//	}
//	
//	@Bean
//	public Employee employee() {
//		System.out.println("Employee method of ApplicationConfig");
//		Address address=new Address();
//		Employee employee=new Employee();
//		employee.setHomeAddress(address);
//		return employee;
//	}
	
	
	
}
