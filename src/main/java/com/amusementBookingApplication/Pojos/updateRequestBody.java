package com.amusementBookingApplication.Pojos;

public class updateRequestBody {
	
	    public String username;
	    public String firstName;
	    public String lastName;
	    public String email;
	    public String password;
	    public String mobileNumber;
	    
		@Override
		public String toString() {
			return "updateRequestBody [username=" + username + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", email=" + email + ", password=" + password + ", mobileNumber=" + mobileNumber + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		public updateRequestBody() {
			super();
		}
		public updateRequestBody(String username, String firstName, String lastName, String email, String password,
				String mobileNumber) {
			super();
			this.username = username;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.password = password;
			this.mobileNumber = mobileNumber;
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

		public String getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
	
	
	

}
