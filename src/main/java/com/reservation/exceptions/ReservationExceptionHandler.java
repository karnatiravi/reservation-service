package com.reservation.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ReservationExceptionHandler {

	@ExceptionHandler(ReservationException.class)
	public ResponseEntity<String> setexception(ReservationException ex) {
		return ResponseEntity.badRequest().body(ex.getMessage());
	}

}
