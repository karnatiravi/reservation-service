package com.reservation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.dao.PassengerDao;
import com.reservation.entity.Passenger;


@RestController
@RequestMapping(value="/passenger")
public class PassengerController {

	
	@Autowired
	@Lazy
	private PassengerDao passengerDao;
	
	@GetMapping(value="/passengerById/{id}")
	public Optional<Passenger> getReservationById(@PathVariable Integer id){
		
		Optional<Passenger> pass=passengerDao.findById(id);
		return pass;
		
		
		
	}
	
}
