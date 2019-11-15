package com.lti.service;

import java.util.List;

import com.lti.dao.EmployeeDao;
import com.lti.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao dao;// =new EmployeeDaoImpl() ;
		
		public EmployeeDao getDao() {
		return dao;
	}

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

		public Employee updateEmployee(Employee employee) {
			// TODO Auto-generated method stub
			return null;
		}
		
		public List<Employee> readAllEmployees() {
			// TODO Auto-generated method stub
			return null;
		}
		
		public int deleteEmployee(int employeeId) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		public int createEmployee(Employee employee) {
			
			return 0;
		}

	
	public boolean addEmployee(Employee employee) {
		int result=dao.createEmployee(employee);
		if(result==1){
			return true;
		}else{
		return false;
		}
	}

	public List<Employee> findAllEmployees() {
		List<Employee> list=dao.readAllEmployees();
		
		return list;
	}

	public boolean removeEmployee(int employeeId) {
		int result=dao.deleteEmployee(employeeId);
		
		if(result==1){
			return true;
		}else{
		return false;
		}
	}

	public Employee modifyEmployee(Employee employee) {
		Employee employee2=dao.updateEmployee(employee);
		
		return employee2;
	}

	

}
