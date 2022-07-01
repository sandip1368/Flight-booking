package com.flight.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class SearchFlight {
	@Id
	private Integer book_id;
	private String fromPlace;
	private String toPlace;
	private Date stratDateTime;
	private Date endDateTime;
	private String tripType;
	
	
	
	public SearchFlight(Integer book_id, String fromPlace, String toPlace, Date stratDateTime, Date endDateTime,
			String tripType) {
		super();
		this.book_id = book_id;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.stratDateTime = stratDateTime;
		this.endDateTime = endDateTime;
		this.tripType = tripType;
	}
	public SearchFlight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	public Date getStratDateTime() {
		return stratDateTime;
	}
	public void setStratDateTime(Date stratDateTime) {
		this.stratDateTime = stratDateTime;
	}
	public Date getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}
	public String getTripType() {
		return tripType;
	}
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}
	

}
