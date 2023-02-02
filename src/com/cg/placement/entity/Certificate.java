package com.cg.placement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="certificate")
public class Certificate {
	@Id
	private int id;
	private int cyear;
	private String ccollege;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCyear() {
		return cyear;
	}
	public void setCyear(int cyear) {
		this.cyear = cyear;
	}
	public String getCcollege() {
		return ccollege;
	}
	public void setCcollege(String ccollege) {
		this.ccollege = ccollege;
	}
	
	


}
