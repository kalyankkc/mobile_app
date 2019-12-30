package com.example.mobileapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	private int mobileId;
	private String mobileName;
	private int price;
	
	public Mobile() {
		super();
	}

	public Mobile(int mobileId, String mobileName, int price) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.price = price;
	}

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
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", price=" + price + "]";
	}
	
	

	
	

}
