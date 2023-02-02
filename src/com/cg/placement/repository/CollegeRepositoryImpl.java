package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entity.College;

public class CollegeRepositoryImpl implements CollegeRepository{

//	step-1 ==> Start the JPA Lifecycle
	private EntityManager entityManager;
	public CollegeRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public College addCollge(College college) {
		// TODO Auto-generated method stub
		entityManager.persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		// TODO Auto-generated method stub
		entityManager.merge(college);
		return college;
	}

	@Override
	public College searchCollege(int clgId) {
		// TODO Auto-generated method stub
		College college = entityManager.find(College.class, clgId);
		return college;
	}

	@Override
	public College deleteCollege(College college) {
		// TODO Auto-generated method stub
		entityManager.remove(college);
		return college;
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

	@Override
	public void deleteCollege(int clgId) {
		// TODO Auto-generated method stub
		College college = entityManager.find(College.class, clgId);
		entityManager.remove(college);
	}

}
