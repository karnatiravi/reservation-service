package com.reservation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.reservation.dao.ReservationDao;
import com.reservation.entity.Reservation;

@Service
public class ReservationService {

	@Autowired
	@Lazy
	private ReservationDao reservation;

	public Optional<Reservation> getReservation(Integer id) {
		Optional<Reservation> reser = reservation.findById(id);
		return reser;
	}

	public List<Reservation> getRservationByAge(Integer age) {
		List<Reservation> list = reservation.getResrvationByAge(age);
		return list;
	}

}
