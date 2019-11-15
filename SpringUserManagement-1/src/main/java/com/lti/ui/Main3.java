package com.lti.ui;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lti.config.AppConfig;
import com.lti.model.Users;
import com.lti.service.UserService;

public class Main3 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService service = context.getBean("service",UserService.class);
		Users user = context.getBean("user",Users.class);
		String username,password;
		boolean result,result1;
		Scanner sc= new Scanner(System.in);
		 int c= 0;
		 System.out.println("enter the username password");
		 username=sc.next();
		 password=sc.next();
		 result1=service.checkLogin(username, password);
		 if(result1){
		
		 System.out.println("enter ur choice: 1.delete 2.add 3 .update 4.AllUserList");
		 c=sc.nextInt();
		switch(c){
		case 1:
			System.out.println("Enter the username you want to delete:");
			 username = sc.next();
			 result = service.removeUser(username);
			if(result){
				System.out.println("user deleted");
			}
			else{
				System.out.println("failed");
			}
			break;
		case 2:
			System.out.println("Enter the details");
			user.setUsername(sc.next());
			user.setPassword(sc.next());
			user.setFirstname(sc.next());
			user.setLastname(sc.next());
			user.setMobilenumber(sc.next());
			
		 result= service.addUser(user);
			if(result){
				System.out.println("user added");
			}
			else{
				System.out.println("failed");
			}
			break;
			
		case 3:
			System.out.println("Enter the  username :");
			user.setUsername(sc.next());
			System.out.println("Enter the details of user you want to update:");
			user.setPassword(sc.next());
			user.setFirstname(sc.next());
			user.setLastname(sc.next());
			user.setMobilenumber(sc.next());
			result=service.updateUser(user);
			
			if(result){
				System.out.println("user updated");
			}
			else{
				System.out.println("failed");
			}
			break;
		case 4:
			List<Users> list =service.findAllUsers();
			for(Users users :list){
				System.out.println(users+"\n");
				
			}
			break;
		}
		 }
		 else{
			 System.out.println("wrong username password");
		 }
		


	}

}
