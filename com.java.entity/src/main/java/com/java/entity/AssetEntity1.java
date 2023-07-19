package com.java.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AssetEntity1 {
	@Id
	private int aid;
	private String aname;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	@Override
	public String toString() {
		return "AssetEntity1 [aid=" + aid + ", aname=" + aname + "]";
	}

}
