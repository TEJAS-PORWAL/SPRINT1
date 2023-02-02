package com.cg.placement.service;

import com.cg.placement.entity.Placement;

public interface PlacementService {
	public Placement addPlacement(Placement placement);
	public Placement updatePlacement(Placement placement);
	public Placement searchPlacement(int id);
	

}
