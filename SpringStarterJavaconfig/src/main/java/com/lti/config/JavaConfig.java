package com.lti.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.lti.model.Address;
import com.lti.model.Employee;

@Configuration
@ComponentScan(basePackages={"com.lti.model"})

public class JavaConfig {
@Bean(name="address1")
	public Address getAddress1(){
		Address address= new Address();
		return address;
		
	}
@Bean(name="address2")
public Address getAddress(){
	Address address= new Address();
	return address;	
}

}