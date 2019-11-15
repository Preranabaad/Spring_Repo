package com.lti.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lti.model.Users;
@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private JdbcTemplate template=null;
	
	public UserDaoImpl(JdbcTemplate template) {
		
		this.template = template;
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	
	private static final String INSERT_USER_RECORD= "insert into Users(username,password,firstname,lastname,mobile) Values (?,?,?,?,?)";
	
	private static final String DELETE_USER_RECORD="delete from Users where username=?";
	
	private static final String UPDATE_USER_RECORD="update users set  password=?, firstname=?,lastname=?,mobile=? where username=?";
	
	private static final String SELECT_USER_RECORD="select * from users"; 
	
	private static final String CHECK_LOGIN="select * from Users where username=? and password=?";
	public UserDaoImpl(){
		
	}
	public int readLogin(String username, String password){
		
		List<Users> list = template.query(CHECK_LOGIN, new Object[]{username,password}, new UserRowMapper());
		return list!=null?list.size():0;
	}
	public List<Users> readAllUsers(){
		List<Users> list = template.query(SELECT_USER_RECORD, new UserRowMapper());
		return list;
	}
	public int deleteUser(String username){
		int result = template.update(DELETE_USER_RECORD,username);
		System.out.println(result);
		return result;
	}
	public int createUser(Users user){
		int result=template.update(INSERT_USER_RECORD,user.getUsername(),user.getPassword(),user.getFirstname(),user.getLastname(),user.getMobilenumber());
		return result;
	}
	public int updateUser(Users user) {
		int result = template.update(UPDATE_USER_RECORD,user.getPassword(),user.getFirstname(),user.getLastname(),user.getMobilenumber(),user.getUsername());
		return result;
	}
}


	
	
	
	
	
	
	


