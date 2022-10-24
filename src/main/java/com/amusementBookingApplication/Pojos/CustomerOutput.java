package com.amusementBookingApplication.Pojos;

public class CustomerOutput {
	public int id;
	public String name;
	public String username;
	public String email;
	public String phoneNo;
	public int getId() {
		return id;
	}
	
	
	
	@Override
	public String toString() {
		return "CustomerOutput [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email
				+ ", phoneNo=" + phoneNo + ", getId()=" + getId() + ", getName()=" + getName() + ", getUsername()="
				+ getUsername() + ", getEmail()=" + getEmail() + ", getPhoneNo()=" + getPhoneNo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	public CustomerOutput() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CustomerOutput(int id, String name, String username, String email, String phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.phoneNo = phoneNo;
	}



	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	

}
