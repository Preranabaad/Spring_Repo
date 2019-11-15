package com.lti.ui;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Employee;
import com.lti.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	EmployeeService service = context.getBean("service",EmployeeService.class);
	
	Employee employee=context.getBean("employee",Employee.class);
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter employee name");
	employee.setEmployeeName(sc.next());
	
	System.out.println("Enter employee salary:");
	employee.setEmployeeSalary(sc.nextDouble());
	
	
	boolean result=service.addEmployee(employee);
	if(result){
		List<Employee>list=	service.findAllEmployees();
		for(Employee emp: list){
			System.out.println(emp);
		}
	}
	else{
		System.out.println("Employee data not saved");
	}
	}

}
