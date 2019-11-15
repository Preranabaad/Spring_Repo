package com.lti.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lti.model.Address;
import com.lti.model.Employee;

@Configuration
public class JavaConfig {
	@Bean(name="employee")
	public Employee getEmployee(){
			Employee employee = new Employee();
			return employee;
		}
	@Bean(name="address")
	public Address getAddress(){
		Address address = new Address();
		return address;
	}
}
