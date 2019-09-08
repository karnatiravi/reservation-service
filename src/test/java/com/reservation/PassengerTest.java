package com.reservation;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.reservation.dao.PassengerDao;
import com.reservation.entity.Gender;
import com.reservation.entity.Passenger;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PassengerTest {

	@Autowired
	private PassengerDao dao;
	
	
	@Test
	public void savePassinger() {
		Passenger p=new Passenger();
		Gender g=new Gender();
		
	
	p.setId(6);
	p.setPassengerName("Duryodhana");
	p.setPassengerAge(67);
	p.setPassengerMobileNo(9885161317l);
	//p.setPassengerGender(g.getId(1));
	
	dao.save(p);
	
	}
	
	@Test
	public void getPassingPassenger() {
		
		Optional<Passenger> p=dao.findById(1);
			
		System.out.println(p.get().getPassengerName());
		
	}
	
	
}
