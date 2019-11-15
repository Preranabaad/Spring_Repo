package com.lti.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Employee;

public class Main2 {

	public static void main(String[] args) {
		
			
			ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
			
			Employee employee= context.getBean("employee",Employee.class);
			System.out.println(employee);
			System.out.println(employee.getAddress());
			
			Employee employee2= context.getBean("employee2",Employee.class);
			System.out.println(employee2);
			System.out.println(employee2.getAddress());
			
			
	}

}
