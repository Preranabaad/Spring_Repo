package com.lti.dao;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private List<Employee> employees ;
	 
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public EmployeeDaoImpl(){	
		System.out.println("Dao");
			//employees= new ArrayList<Employee>();
	}
	public boolean createEmployee(Employee employee) {
		boolean result=employees.add(employee);
		return result;
	}
	public List<Employee> readAllEmployees() {
		
		return employees;
	}

}
