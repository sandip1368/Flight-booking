package com.flight.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.entity.Flight;
import com.flight.exception.RecordNotFoundException;
import com.flight.repository.FlightEntity;
import com.flight.service.InterFlight;

@Service
public class FlightServiceImpl implements InterFlight {

	@Autowired
	private FlightEntity flightEntity;
	
	
	@Override
	public Integer addFlight(Flight flight) {

		Flight fght= flightEntity.save(flight);
		return fght.getFlightNo();
	}


//	public List<Flight> search(SearchFlight searchFlight) {
//		
//	return flightEntity.searchFlight(searchFlight.getFromPlace(),searchFlight.getToPlace(),searchFlight.getStratDateTime()
//.toInstant().atZone(ZoneId.systemDefault())
//.toLocalDate(),searchFlight.getEndDateTime().toInstant()
//.atZone(ZoneId.systemDefault())
//.toLocalDate(),searchFlight.getTripType());
//	}


	
	
	
	
	@Override
	public void delete(Integer flightNo) {
	
		flightEntity.deleteById(flightNo);
	}


	@Override
	public String validDataLogin(String username, String password) {
		String msg="";
		if(username.equals("Admin") && password.equals("admin1234"))
		{
		return	msg="Success";
		}
		else {
			return msg;
		}

	}


	@Override
	public List<Flight> viewAllFlight() {
		
		return flightEntity.findAll();
	}


	public Flight editFlight(Integer flightNo, Flight flight) {
		   
	Flight rst=flightEntity.findById(flightNo).orElseThrow(() -> new RecordNotFoundException("Record Not Found"+flightNo));
		
			rst.setAirLinename(flight.getAirLinename());
			rst.setBusinessSeat(flight.getBusinessSeat());
			rst.setStartDate(flight.getStartDate());
			rst.setEndDate(flight.getEndDate());
			rst.setFromPlace(flight.getFromPlace());
			rst.setInstrument(flight.getInstrument());
			rst.setMeal(flight.getMeal());
			rst.setNonBusinessSeat(flight.getNonBusinessSeat());
			rst.setTicket(flight.getTicket());
			rst.setToPlace(flight.getToPlace());
			rst.setWays(flight.getWays());
			rst.setBlock(flight.isBlock());
		return 	flightEntity.save(rst);
			
	
	}


	@Override
	public Optional<Flight> viewFlightById(Integer flightNo) {
	
		
	return	flightEntity.findById(flightNo);
		
	}


	public List<Flight> search(String fromPlace, String toPlace,Date startDate,Date endDate) {
		
		return flightEntity.searchdata(fromPlace,toPlace,startDate,endDate);
	
		
	}


	


	


	
}
