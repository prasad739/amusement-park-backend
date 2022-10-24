package com.amusementBookingApplication.Service;

import com.amusementBookingApplication.Entity.Customer;
import com.amusementBookingApplication.Exception.CustomerNotFoundException;
import com.amusementBookingApplication.Exception.InvalidId;
import com.amusementBookingApplication.Exception.TicketNotFoundException;
import com.amusementBookingApplication.Pojos.CustomerOutput;
import com.amusementBookingApplication.Pojos.LoginRequest;
import com.amusementBookingApplication.Pojos.updateRequestBody;

public interface CustomerService {
	
	
	    public Customer addCustomer(LoginRequest log);
		public Customer updateCustomer(LoginRequest customer) throws CustomerNotFoundException;
		public Customer deleteCustomer(int id) throws CustomerNotFoundException, TicketNotFoundException ;
		public Customer vaildCustomer(String Email, String Password) throws InvalidId ;
		public CustomerOutput getCustomer(int customerId) throws CustomerNotFoundException;
		public Customer getCustomerByEmail(String email);
		Customer updateCustomerById(updateRequestBody customer, int id) throws CustomerNotFoundException;
		
		
}
