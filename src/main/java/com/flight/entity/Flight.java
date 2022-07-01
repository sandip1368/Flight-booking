package com.flight.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "flight")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer flightNo;
	
	private String airLinename;
	private String fromPlace;
	private String toPlace;
	
@DateTimeFormat(pattern ="yyyy-MM-dd")
@Temporal(TemporalType.DATE)
	private Date startDate;
@DateTimeFormat(pattern ="yyyy-MM-dd")
@Temporal(TemporalType.DATE)
   private Date endDate;

	private String instrument;
	private Integer businessSeat;
	private Integer nonBusinessSeat;
	private Double ticket;
	private String meal;
	private String ways;
	
private boolean block;
	public Flight() {
		super();

	}
	
	
	public Flight(Integer flightNo, String airLinename, String fromPlace, String toPlace, Date startDate, Date endDate,
			String instrument, Integer businessSeat, Integer nonBusinessSeat, Double ticket, String meal, String ways,
			boolean block) {
		super();
		this.flightNo = flightNo;
		this.airLinename = airLinename;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.startDate = startDate;
		this.endDate = endDate;
		this.instrument = instrument;
		this.businessSeat = businessSeat;
		this.nonBusinessSeat = nonBusinessSeat;
		this.ticket = ticket;
		this.meal = meal;
		this.ways = ways;
		this.block = block;
	}


	public Integer getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(Integer flightNo) {
		this.flightNo = flightNo;
	}
	public String getAirLinename() {
		return airLinename;
	}
	public void setAirLinename(String airLinename) {
		this.airLinename = airLinename;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	public Integer getBusinessSeat() {
		return businessSeat;
	}
	public void setBusinessSeat(Integer businessSeat) {
		this.businessSeat = businessSeat;
	}
	public Integer getNonBusinessSeat() {
		return nonBusinessSeat;
	}
	public void setNonBusinessSeat(Integer nonBusinessSeat) {
		this.nonBusinessSeat = nonBusinessSeat;
	}
	public Double getTicket() {
		return ticket;
	}
	public void setTicket(Double ticket) {
		this.ticket = ticket;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public String getWays() {
		return ways;
	}
	public void setWays(String ways) {
		this.ways = ways;
	}
	public boolean isBlock() {
		return block;
	}
	public void setBlock(boolean block) {
		this.block = block;
	}

	
}

