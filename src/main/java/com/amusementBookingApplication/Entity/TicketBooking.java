package com.amusementBookingApplication.Entity;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class TicketBooking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketBookingId;
	
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "customer_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Customer customer;

	
	@ManyToOne(optional = false)
	@JoinColumn(name = "activity_id")
	@OnDelete(action =OnDeleteAction.CASCADE)
	private Activity activity;
	
	private LocalDateTime dateTime;
	//private float bill;

	public TicketBooking() {
		super();
	}
	public TicketBooking(int ticketBookingId, Customer customer, Activity activity, LocalDateTime dateTime) {
		super();
		this.ticketBookingId = ticketBookingId;
		this.customer = customer;
		this.activity = activity;
		this.dateTime = dateTime;
	}
	public int getTicketBookingId() {
		return ticketBookingId;
	}
	public void setTicketBookingId(int ticketBookingId) {
		this.ticketBookingId = ticketBookingId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Activity getActivity() {
		return activity;
	}
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
		
	
}