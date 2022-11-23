package com.example.xpbowling;

import com.example.xpbowling.reservation.model.BowlingReservation;
import com.example.xpbowling.reservation.model.Reservation;
import com.example.xpbowling.reservation.repository.ReservationRepository;
import com.example.xpbowling.login.repository.LoginRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class XPbowlingApplication {

    public static void main(String[] args) {
        SpringApplication.run(XPbowlingApplication.class, args);
    }

    @Bean
    public CommandLineRunner importData(ReservationRepository reservationRepository){
        return (args -> {
            BowlingReservation reservationbowl1 = new BowlingReservation("Bollamolla", "email", 1200, 1400, 4, 1, 10);
            BowlingReservation reservationbowl2 = new BowlingReservation("Millabolla", "emailena", 1400, 1600, 6, 3, 1, 2, 3);

            reservationRepository.save(reservationbowl1);
            reservationRepository.save(reservationbowl2);



        });
    }

}
