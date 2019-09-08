package com.reservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EnableCaching
@EnableEurekaClient
@EnableJpaRepositories({ "com.reservation.dao" })
@ComponentScan({ "com.reservation.controller", "com.reservation.service", "com.reservation.exceptions","com.reservation.swagger" })
@EntityScan({ "com.reservation.entity" })
@EnableFeignClients({ "com.reservation.feign" })
public class ReservationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationServiceApplication.class, args);
	}

}
