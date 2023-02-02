package com.cg.placement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College {
	@Id
	private int clgId;
	private String admin;
	private String collegelocation;
	private String collegename;
	public int getClgId() {
		return clgId;
	}
	public void setClgId(int clgId) {
		this.clgId = clgId;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getCollegelocation() {
		return collegelocation;
	}
	public void setCollegelocation(String collegelocation) {
		this.collegelocation = collegelocation;
	}
	public String getCollgename() {
		return collegename;
	}
	public void setCollgename(String collgename) {
		this.collegename = collgename;
	}
	
	
}
