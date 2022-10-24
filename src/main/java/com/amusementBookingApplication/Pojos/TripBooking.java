package com.amusementBookingApplication.Pojos;

import java.util.List;

import com.amusementBookingApplication.Entity.Activity;

public class TripBooking {
	
	
	public int customerId;
	public String name;
	public float bill;
	public List<Activity> activities;
	
	@Override
	public String toString() {
		return "TripBooking [customerId=" + customerId + ", name=" + name + ", bill=" + bill + ", activities="
				+ activities + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



 public TripBooking() {
		super();
	} 
	


	public TripBooking(int customerId, String name, float bill, List<Activity> activities) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.bill = bill;
		this.activities = activities;
	}


	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBill() {
		return bill;
	}

	public void setBill(float bill) {
		this.bill = bill;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
	
	
	
}
