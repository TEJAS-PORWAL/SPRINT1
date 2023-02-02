package com.cg.placement.service;

import com.cg.placement.entity.College;
import com.cg.placement.repository.CollegeRepository;
import com.cg.placement.repository.CollegeRepositoryImpl;

public class CollegeServiceImpl implements CollegeService{

//	Step-1 ==> Establishing Connection between service and repository
	private CollegeRepository dao;
	
	public CollegeServiceImpl() {
		dao = new CollegeRepositoryImpl();
	}
	
//	Step-2 ==> service calls to perform CRUD operations
	@Override
	public College addCollege(College college) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addCollge(college);
		dao.commitTransaction();
		return null;
	}

	@Override
	public College updateCollege(College college) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return null;
	}

	@Override
	public College searchCollege(int clgId) {
		// TODO Auto-generated method stub
		College college = dao.searchCollege(clgId);
		return college;
	}

	@Override
	public College deleteCollege(College college) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.deleteCollege(college);
		dao.commitTransaction();
		return null;
	}

//	@Override
//	public College deleteCollege(int clgId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
