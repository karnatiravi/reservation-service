package com.reservation.feign;

import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.reservation.entity.Passenger;

//@FeignClient(name="reservation-service",url="localhost:8899")
@FeignClient(name="reservation-service")
@RibbonClient(name="reservation-service")

public interface PassengerFeignProxy {

	@GetMapping(value="/passengerById/{id}")
	public Optional<Passenger> getReservationById(@PathVariable Integer id);
	
}
