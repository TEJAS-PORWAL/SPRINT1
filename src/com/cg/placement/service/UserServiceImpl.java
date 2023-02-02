package com.cg.placement.service;

import com.cg.placement.entity.User;
import com.cg.placement.repository.UserRepository;
import com.cg.placement.repository.UserRepositoryImpl;

public class UserServiceImpl implements UserService{

	private UserRepository dao;
	public UserServiceImpl() {
		dao = new UserRepositoryImpl();
	}
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User deleteUser(int id) {
		// TODO Auto-generated method stub
		User user = dao.deleteUser(id);
		return user;
	}

}
