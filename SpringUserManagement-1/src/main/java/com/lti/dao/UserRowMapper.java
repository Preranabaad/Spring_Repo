package com.lti.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.lti.model.Users;

public class UserRowMapper implements RowMapper<Users>
{

	public Users mapRow(ResultSet rs, int arg1) throws SQLException {
		Users user = new Users();
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setFirstname(rs.getString("firstname"));
		user.setLastname(rs.getString("lastname"));
		user.setMobilenumber(rs.getString("mobile"));
		
	
		return user;
	}

	
		
	}


