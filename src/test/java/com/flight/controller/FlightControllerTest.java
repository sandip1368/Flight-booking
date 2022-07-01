package com.flight.controller;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.TemporalType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.flight.entity.Flight;
import com.flight.repository.FlightEntity;
import com.flight.service.InterFlight;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightControllerTest {
	
	
	@MockBean
	private FlightEntity flightEntity;
	
	@Autowired
	private InterFlight interflight;
	
	@Test
	public void add() {
	Integer flightNo=1;
	//Flight flight= new Flight(1,"spaceJet","Pune","mumbai",new Date(),LocalTime.now(),new Date(),LocalTime.now(),"abc",5,20,20,"Veg","return");
		
	}
	

}
