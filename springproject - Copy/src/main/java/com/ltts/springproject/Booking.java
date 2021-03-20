package com.ltts.springproject;

import javax.persistence.Id;
import javax.persistence.Entity;
 
@Entity

public class Booking {
	private long Id;
	  private int car_id;
	  private String email_id;
	  private String booking_date;
	  private int many_days;
	  private String Status;
	  private String booked_date;
	  
	  
	 

	public Booking() {
		}
	  
	  @Id
	  public long getId() {
			return Id;
		}
		public void setId(long id) {
			Id = id;
		}
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(String booking_date) {
		this.booking_date = booking_date;
	}
	public int getMany_days() {
		return many_days;
	}
	public void setMany_days(int many_days) {
		this.many_days = many_days;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	 public String getBooked_date() {
			return booked_date;
		}

		public void setBooked_date(String booked_date) {
			this.booked_date = booked_date;
		}
	    
}
