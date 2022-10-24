package com.amusementBookingApplication.Entity;


import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@MappedSuperclass
public abstract class AbstractUser {
	private String username;
	private String firstName;
	private String lastName;
	private String password;
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String mobileNumber;
	@Email(message = "Enter a valid email address")
	private String email;
	
	
	public AbstractUser() {
		super();
	}
	
	public AbstractUser(String username, String firstName, String lastName, String password, String mobileNumber,
			String email) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}

	@Override
	public String toString() {
		return "AbstractUser [username=" + username + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", mobileNumber=" + mobileNumber + ", email=" + email + ", getUsername()="
				+ getUsername() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getPassword()=" + getPassword() + ", getMobileNumber()=" + getMobileNumber() + ", getEmail()="
				+ getEmail() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
