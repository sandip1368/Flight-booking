package com.flight.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.flight.entity.Flight;

@Repository
public interface FlightEntity extends JpaRepository<Flight,Integer>{
	
	
	@Query("from Flight where fromPlace= :fromPlace and toPlace= :toPlace and startDate= :startDate and endDate= :endDate and block=true")
	List<Flight> searchdata(@Param("fromPlace")String fromPlace,@Param("toPlace") String toPlace, @Param("startDate") Date startDate,@Param("endDate") Date endDate);
	
	
	
//	@Query(value="SELECT * FROM FLIGHT f WHERE f.fromPlace=: fromPlace and f.toPlace=:toPlace and Date(f.start_date_time)=:startDateTime and Date(f.end_date_time)=:endDateTime and ways=:tripType "
//	,nativeQuery =true )
//	List<Flight> searchFlight(String fromPlace, String toPlace,@Param("startDateTime") LocalDate startDateTime ,
//			@Param("endDateTime") LocalDate endDateTime,String tripType);




}
