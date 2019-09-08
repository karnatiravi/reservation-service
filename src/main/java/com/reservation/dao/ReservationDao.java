package com.reservation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.reservation.entity.Reservation;



@Repository
public interface ReservationDao extends JpaRepository<Reservation, Integer>{
	
	
	
	@Query("select r from Reservation r join r.passenger p where p.passengerAge=?1 ")
	public List<Reservation> getResrvationByAge(Integer age);

}
