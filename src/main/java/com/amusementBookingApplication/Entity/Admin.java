package com.amusementBookingApplication.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity
public class Admin extends AbstractUser{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "adminLogin_id")
	private Login login;

	public Admin() {
		super();
	}

	public Admin(int adminId, Login login) {
		super();
		this.adminId = adminId;
		this.login = login;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	
	
	
	
}

