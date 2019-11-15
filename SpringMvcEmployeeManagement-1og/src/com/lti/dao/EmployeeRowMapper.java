package com.lti.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lti.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>
{

	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeId(rs.getInt("emp_id"));
		employee.setEmployeeName(rs.getString("emp_name"));
		employee.setEmployeeSalary(rs.getDouble("Emp_sal"));
		return employee;
	}

}
