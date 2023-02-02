package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entity.User;

public class UserRepositoryImpl implements UserRepository {

//	start the JPA Lifecycle
	private EntityManager entityManager;
	public UserRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		entityManager.merge(user);
		return user;
	}

	@Override
	public User deleteUser(int id) {
		// TODO Auto-generated method stub
		User user = entityManager.find(User.class, id);
		return user;
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}

}
