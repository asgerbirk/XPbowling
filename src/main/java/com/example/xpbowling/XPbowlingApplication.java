package com.example.xpbowling;

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
    public CommandLineRunner importData(ReservationRepository reservationRepo, LoginRepository userRepository){
        return (args -> {





        });
    }

}
