package com.cg.placement.repository;

import com.cg.placement.entity.Placement;

public interface PlacementRepository {
//	addPlacement(Placement placement) + updatePlacement(Placement placement) + searchPlacement(long id)
	public Placement addPlacement(Placement placement);
	public Placement updatePlacement(Placement placement);
	public Placement searchPlacement(int id);

	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
