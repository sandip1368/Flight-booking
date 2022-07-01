package com.flight.controller;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entity.Flight;
import com.flight.service.InterFlight;

@RestController
@RequestMapping("/api/V1.0/flight")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FlightController {

	@Autowired
	private InterFlight interFlight;



	@PostMapping("/register")
	//@ExceptionHandler(RecordAlreadyPresentException.class) 
	public ResponseEntity<?> add(@RequestBody Flight flight) {
		Integer result = interFlight.addFlight(flight);

		if (result > 0) {
			return new ResponseEntity<>("Successfully added" + result + "", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Unable to add" + result + "", HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@GetMapping("/search/{fromPlace}/{toPlace}/{startDate}/{endDate}")
	public List<Flight> find(@PathVariable("fromPlace") String fromPlace,@PathVariable("toPlace") String toPlace, @PathVariable("startDate") Long startDate,@PathVariable("endDate") Long endDate  ) throws ParseException{
		Date startDate1 = timeStampToDate(startDate);
		Date endDate1 = timeStampToDate(endDate);
		List<Flight> resultSearch=interFlight.search(fromPlace,toPlace,startDate1,endDate1);
	
	return resultSearch;
		
	}
	
	
	private Date timeStampToDate(Long timeStamp) throws ParseException {
        Timestamp ts=new Timestamp(timeStamp);
        Date date=new Date(ts.getTime());
        
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        String dmy = dt.format(date);
        
      
        return dt.parse(dmy);
    }
	
	
	
	
	@GetMapping("/admin/{username}/{password}")
	public ResponseEntity<?> login(@PathVariable String username,@PathVariable String password)
	{
		
		String result=interFlight.validDataLogin(username,password);
		if(result.equalsIgnoreCase("Success"))
		{
			return new ResponseEntity<>("Successfully logged In", HttpStatus.OK);
		}
		else {
			
			return new ResponseEntity<>("Try with Valid credentials", HttpStatus.BAD_GATEWAY);
		}
		
	}

	@GetMapping("allFlight")
	public List<Flight> viewAllFlight()
	{
		return interFlight.viewAllFlight();
	}
	
	@GetMapping("viewFlight/{id}")
public Optional<Flight> getflightById(@PathVariable ("id") Integer flightNo)	
{
	return interFlight.viewFlightById(flightNo);
		
}
	
	
	
	@DeleteMapping("/removeFlight/{id}")
	//@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> remove(@PathVariable("id") Integer flightNo)
	{
		
		interFlight.delete(flightNo);	
			
			return ResponseEntity.ok().body("fligh successfully Deleted");
	
		}

	@PutMapping("/editFlight/{id}")
	public Flight editFlight(@PathVariable ("id") Integer flightNo , @RequestBody Flight flight )
	{
			Flight editflightResult=interFlight.editFlight(flightNo,flight);
					return editflightResult;
	}
}