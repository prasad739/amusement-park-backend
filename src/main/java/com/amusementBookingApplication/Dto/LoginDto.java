package com.amusementBookingApplication.Dto;

public class LoginDto {
	private String loginEmail;
	private String loginPassword;
	
	@Override
	public String toString() {
		return "LoginDto [loginEmail=" + loginEmail + ", loginPassword=" + loginPassword + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

	public LoginDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LoginDto(String loginEmail, String loginPassword) {
		super();
		this.loginEmail = loginEmail;
		this.loginPassword = loginPassword;
	}

	public String getLoginEmail() {
		return loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	
	

}
