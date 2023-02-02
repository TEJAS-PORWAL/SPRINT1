package com.cg.placement.client;

import com.cg.placement.entity.College;
import com.cg.placement.service.CollegeServiceImpl;
import com.cg.placement.service.CollegeService;

public class Client {
	public static void main(String[] args) {
		
		College college = new College();
		CollegeService service = new CollegeServiceImpl();
		
		college.setClgId(0);
		college.setAdmin("admin");
		college.setCollegelocation("bangalore");
		college.setCollgename("DRAIT");
		
		service.addCollege(college);
		System.out.println("College entered to the data-base");
	}
}
