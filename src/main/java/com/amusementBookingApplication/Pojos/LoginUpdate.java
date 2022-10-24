package com.amusementBookingApplication.Pojos;

public class LoginUpdate {
	
	public int updateId;
	public String email;
	public String password;
	public int getUpdateId() {
		return updateId;
	}
	
	
	public LoginUpdate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginUpdate(int updateId, String email, String password) {
		super();
		this.updateId = updateId;
		this.email = email;
		this.password = password;
	}



	public void setUpdateId(int updateId) {
		this.updateId = updateId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
