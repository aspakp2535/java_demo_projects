package com.java.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EmployeeEntity {
	@Id
	private int eid;
	private String ename;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "assetId_fk", unique = true)
	private AssetEntity1 asset;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public AssetEntity1 getAsset() {
		return asset;
	}

	public void setAsset(AssetEntity1 asset) {
		this.asset = asset;
	}

	@Override
	public String toString() {
		return "EmployeeEntity1 [eid=" + eid + ", ename=" + ename + ", asset=" + asset + "]";
	}

}
