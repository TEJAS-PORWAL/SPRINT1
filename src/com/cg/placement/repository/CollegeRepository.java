package com.cg.placement.repository;
import com.cg.placement.entity.College;

public interface CollegeRepository {
	//addCollege(College college) + updateCollege(College college) + searchCollege(long id) + deleteCollege(long id)
		public College addCollge(College college);
		public College updateCollege(College college);
		public College searchCollege(int clgId);
		public College deleteCollege(College college);
		
		public abstract void beginTransaction();
		public abstract void commitTransaction();
		void deleteCollege(int clgId);

}
