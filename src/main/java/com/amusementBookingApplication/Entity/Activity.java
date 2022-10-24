package com.amusementBookingApplication.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int activityId;
	private String description;
	private float charges;
	
	public Activity() {
		super();
	}

	public Activity(int activityId, String description, float charges) {
		super();
		this.activityId = activityId;
		this.description = description;
		this.charges = charges;
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}
	
	
	

}
