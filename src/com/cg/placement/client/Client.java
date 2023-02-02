package com.cg.placement.client;

import java.time.LocalDate;

import com.cg.placement.entity.Placement;
import com.cg.placement.service.PlacementService;
import com.cg.placement.service.PlacementServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Placement placement = new Placement();
		PlacementService service = new PlacementServiceImpl();
		
		placement.setId(0);
		placement.setName("infor");
		placement.setCollege("DRAIT");
		LocalDate date = LocalDate.now();
		placement.setDate(date);
		placement.setQualification("B.TECH - CSE");
		placement.setYear(2023);
		
		service.addPlacement(placement);
		System.out.println("new placement entry");

	}

}
