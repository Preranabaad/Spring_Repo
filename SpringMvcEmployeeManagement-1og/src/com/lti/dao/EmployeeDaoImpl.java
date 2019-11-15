package com.lti.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lti.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private JdbcTemplate template=null;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	private static final String INSERT_EMP_RECORD= "insert into Emp(emp_id, emp_name,emp_sal) Values (Emp_EmpID.nextval,?,?)";
	
	private static final String DELETE_EMP_RECORD="delete from Emp where Emp_id=?";
	
	private static final String UPDATE_EMP_RECORD="update emp set emp_name=?, emp_sal=? where emp_id=?";
	
	private static final String SELECT_EMP_RECORD="select * from emp"; 
	
	public int createEmployee(Employee employee) {
		int result=template.update(INSERT_EMP_RECORD, employee.getEmployeeName(),employee.getEmployeeSalary());
		return result;
	}

	public List<Employee> readAllEmployees() {
		List<Employee> list=template.query(SELECT_EMP_RECORD, new EmployeeRowMapper() );
		return list;
	}

	public int deleteEmployee(int employeeId) {
		int result =template.update(DELETE_EMP_RECORD,employeeId);
		return result;
	}

	public Employee updateEmployee(Employee employee) {
		int result =template.update(UPDATE_EMP_RECORD,employee.getEmployeeName(),employee.getEmployeeSalary(),employee.getEmployeeId());
		if(result==1){
			return employee;
		}
		return null;
	}

}
