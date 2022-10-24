package com.amusementBookingApplication.Pojos;


public class LoginRequest {
	public int id;
	public String userName;
	public String firstname;
	public String lastName;
	public String loginEmail;
	public String logiPassword;
	public String mobileNo;
	//public Job job;
	
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "LoginRequest [id=" + id + ", userName=" + userName + ", firstname=" + firstname + ", lastName="
				+ lastName + ", loginEmail=" + loginEmail + ", logiPassword=" + logiPassword + ", mobileNo=" + mobileNo
				+ ", getId()=" + getId() + ", getUserName()=" + getUserName() + ", getFirstname()=" + getFirstname()
				+ ", getLastName()=" + getLastName() + ", getLoginEmail()=" + getLoginEmail() + ", getLogiPassword()="
				+ getLogiPassword() + ", getMobileNo()=" + getMobileNo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLoginEmail() {
		return loginEmail;
	}
	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}
	public String getLogiPassword() {
		return logiPassword;
	}
	public void setLogiPassword(String logiPassword) {
		this.logiPassword = logiPassword;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
}
