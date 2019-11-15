package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.UserDao;
import com.lti.model.Users;
@Service("service")

public class UserServiceImpl implements UserService {
	@Autowired
	UserDao dao = null;
	
	
	public UserServiceImpl(UserDao dao) {
		
		this.dao = dao;
	}
	public UserDao getDao() {
		return dao;
	}
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	public UserServiceImpl(){
		
	}
	public boolean checkLogin(String username, String password){
		int result = dao.readLogin(username, password);
		if(result ==1)
			return true;
		else
			return false;
	}
	public List<Users> findAllUsers(){
		return dao.readAllUsers();
	}
	public boolean removeUser(String username){
		int result = dao.deleteUser(username);
		if(result ==1)
			return true;
		else
			return false;
	}
	public boolean addUser(Users user){
		int result = dao.createUser(user);
		if(result ==1)
			return true;
		else
			return false;
	}
	public boolean updateUser(Users user) {
		int result = dao.updateUser(user);
		if(result ==1)
			return true;
		else
			return false;
	}
}






