package com.cg.placement.repository;

import com.cg.placement.entity.User;

public interface UserRepository {
//	addNewUser(User user) + updateUser(User user) + deleteUser(long id)
	public User addUser(User user);
	public User updateUser(User user);
	public User deleteUser(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
}
