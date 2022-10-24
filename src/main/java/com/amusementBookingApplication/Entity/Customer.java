package com.amusementBookingApplication.Entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Customer extends AbstractUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerLogin_id")
	private Login login;

	public Customer() {
		super();
	}

	public Customer(int customerId, Login login) {
		super();
		this.customerId = customerId;
		this.login = login;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}


	

}

