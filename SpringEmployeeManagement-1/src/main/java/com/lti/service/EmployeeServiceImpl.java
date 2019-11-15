package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.lti.dao.EmployeeDao;
import com.lti.model.Employee;

public class EmployeeServiceImpl implements EmployeeService, InitializingBean,DisposableBean{
	private EmployeeDao dao;
	
	public EmployeeServiceImpl(){
		System.out.println("service");
	}
	
	public boolean addEmployee(Employee employee) {
		return dao.createEmployee(employee);
	}

	public EmployeeDao getDao() {
		return dao;
	}

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	public List<Employee> findAllEmployees() {
		
		return dao.readAllEmployees();
	}

	
	public void afterPropertiesSet() throws Exception {
	System.out.println("init");
		
	}
	public void destroy() throws Exception {
	System.out.println("destroyed");
		
	}


	

}
