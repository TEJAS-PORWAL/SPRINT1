package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entity.Placement;

public class PlacementRepositoryImpl implements PlacementRepository {

//	start the JPA Lifecycle
	private EntityManager entityManager;
	public PlacementRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public Placement addPlacement(Placement placement) {
		// TODO Auto-generated method stub
		entityManager.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		// TODO Auto-generated method stub
		entityManager.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacement(int id) {
		// TODO Auto-generated method stub
		Placement placement = entityManager.find(Placement.class, id);
		return placement;
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
