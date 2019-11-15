package com.lti.dao;

import java.util.List;

import com.lti.model.Employee;

public interface EmployeeDao
{
	public boolean createEmployee(Employee employee);
	public List<Employee> readAllEmployees();
}
