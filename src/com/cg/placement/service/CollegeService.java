package com.cg.placement.service;

import com.cg.placement.entity.College;

public interface CollegeService {
	public College addCollege(College college);
	
	public College updateCollege(College college);
	
	public College searchCollege(int clgId);
	
	public College deleteCollege(College college);
//	public College deleteCollege(int clgId);
}
