package com.lti.ui;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Employee;
import com.lti.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Employee employee=context.getBean("employee",Employee.class);
		
		//Employee employee2=context.getBean("employee2",Employee.class);
		
		EmployeeService service= context.getBean("service", EmployeeService.class);
		/*boolean result= service.addEmployee(employee);
		if(result){
			System.out.println("Employee sdded Successfull in in-memoery DB");
			}else{
				System.out.println("employee Not added");
			}
		*/
		//boolean result2= service.addEmployee(employee2);
		
	List<Employee> list= service.findAllEmployees();
		System.out.println(list);
	
	}

}
