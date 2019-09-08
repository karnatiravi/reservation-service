package com.reservation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.entity.Passenger;
import com.reservation.entity.Reservation;
import com.reservation.exceptions.ReservationException;
import com.reservation.feign.PassengerFeignProxy;
import com.reservation.service.ReservationService;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Lazy;

@RestController
@RequestMapping(value = "/reservation")
public class ReservationController {

	@Autowired
	@Lazy
	private ReservationService service;

	@Autowired
	//private PassengerFeignProxy feignProxy;

	private static Logger logger = LoggerFactory.getLogger(ReservationController.class);

	@GetMapping(value = "/reservationById/{id}")
	@Cacheable(value = "reserv")
	public Optional<Reservation> getPassengerById(@PathVariable Integer id) throws ReservationException {

		logger.info("Entered into getReservationById method in ReservationController class");

		Optional<Reservation> res = service.getReservation(id);
		if (res == null) {
			System.out.println("the object is null");
			throw new ReservationException("No Records Found!!");
		} else {
			return res;
		}
	}

	@GetMapping(value = "/passengerProxyById/{id}")
	public Optional<Passenger> getPassengerFeignById(@PathVariable Integer id) {

		//Optional<Passenger> p = feignProxy.getReservationById(id);
		
		//return p;
		return null;

	}

	@RequestMapping(value = "/personAge/{age}")
	public List<Reservation> getreservationByAge(@PathVariable Integer age) {
		List<Reservation> list = service.getRservationByAge(age);
		return list;
	}

}
