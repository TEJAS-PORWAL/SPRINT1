package com.cg.placement.client;

import com.cg.placement.entity.User;
import com.cg.placement.service.UserService;
import com.cg.placement.service.UserServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		UserService service = new UserServiceImpl();
		
		user.setId(0);
		user.setName("Tejas Porwal");
		user.setType("student");
		user.setPassword("MESSi010");
		
		service.addUser(user);
		System.out.println("NEW USER ADDED IN db");
	}

}
