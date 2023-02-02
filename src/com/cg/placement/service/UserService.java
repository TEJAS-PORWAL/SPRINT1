package com.cg.placement.service;

import com.cg.placement.entity.User;

public interface UserService {
	public User addUser(User user);
	public User updateUser(User user);
	public User deleteUser(int id);

}
