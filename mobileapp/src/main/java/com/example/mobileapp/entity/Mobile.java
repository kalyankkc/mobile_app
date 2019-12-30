package com.example.mobileapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	private int mobileId;
	private String mobileName;
	private int Price;
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public Mobile(int mobileId, String mobileName, int price) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		Price = price;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
