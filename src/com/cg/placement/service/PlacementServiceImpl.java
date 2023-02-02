package com.cg.placement.service;

import com.cg.placement.entity.Placement;
import com.cg.placement.repository.PlacementRepository;
import com.cg.placement.repository.PlacementRepositoryImpl;

public class PlacementServiceImpl implements PlacementService {

	private PlacementRepository dao;
	public PlacementServiceImpl() {
		dao = new PlacementRepositoryImpl();
	}
	
	@Override
	public Placement addPlacement(Placement placement) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(int id) {
		// TODO Auto-generated method stub
		Placement placement = dao.searchPlacement(id);
		return placement;
	}

}
