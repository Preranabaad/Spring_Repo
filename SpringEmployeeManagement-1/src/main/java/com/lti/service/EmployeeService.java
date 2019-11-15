package com.lti.service;

import java.util.List;

import com.lti.model.Employee;

public interface EmployeeService {
	public boolean addEmployee(Employee employee);
	public List<Employee> findAllEmployees();
}
