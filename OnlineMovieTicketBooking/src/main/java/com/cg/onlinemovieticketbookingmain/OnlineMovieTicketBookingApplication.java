package com.cg.onlinemovieticketbookingmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OnlineMovieTicketBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineMovieTicketBookingApplication.class, args);
	}

}
