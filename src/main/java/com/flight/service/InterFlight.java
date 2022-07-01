package com.flight.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.flight.entity.Flight;

public interface InterFlight {

	Integer addFlight(Flight flight);

	void delete(Integer flightNo);

	String validDataLogin(String username, String password);

	List<Flight> viewAllFlight();

	Flight editFlight(Integer flightNo, Flight flight);

	Optional<Flight> viewFlightById(Integer flightNo);

	List<Flight> search(String fromPlace, String toPlace,Date startDate,Date endDate);



}
