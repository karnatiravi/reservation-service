package com.reservation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Passenger {

	@Id
	@GeneratedValue
	private Integer id;
	private String passengerName;
	private Integer passengerAge;
	private Long passengerMobileNo;
	
	@ManyToOne
	@JoinColumn(name="genderId")
	private Gender passengerGender;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Integer getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(Integer passengerAge) {
		this.passengerAge = passengerAge;
	}

	public Long getPassengerMobileNo() {
		return passengerMobileNo;
	}

	public void setPassengerMobileNo(Long passengerMobileNo) {
		this.passengerMobileNo = passengerMobileNo;
	}

	public Gender getPassengerGender() {
		return passengerGender;
	}

	public void setPassengerGender(Gender passengerGender) {
		this.passengerGender = passengerGender;
	}
	
	
	
	
	
}
