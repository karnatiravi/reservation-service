package com.reservation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.reservation.dao.PassengerDao;
import com.reservation.entity.Passenger;

@Service
public class PassengerService {

	@Autowired
	@Lazy
	private PassengerDao passenger;

	public Optional<Passenger> getPassenger(Integer id) {
		Optional<Passenger> pass = passenger.findById(id);
		return pass;

		
	}

}
