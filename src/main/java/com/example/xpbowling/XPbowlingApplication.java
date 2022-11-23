package com.example.xpbowling;

import com.example.xpbowling.equipment.model.*;
import com.example.xpbowling.equipment.repository.EquipmentRepository;
import com.example.xpbowling.reservation.model.BowlingReservation;
import com.example.xpbowling.reservation.model.Reservation;
import com.example.xpbowling.reservation.repository.ReservationRepository;
import com.example.xpbowling.login.repository.LoginRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class XPbowlingApplication {

    public static void main(String[] args) {
        SpringApplication.run(XPbowlingApplication.class, args);
    }

    @Bean
    public CommandLineRunner importData(ReservationRepository reservationRepository, EquipmentRepository equipmentRepository){
        return (args -> {
            BowlingReservation reservationbowl1 = new BowlingReservation("Bollamolla", "email", 1200, 1400, 4, 1, 10);
            BowlingReservation reservationbowl2 = new BowlingReservation("Millabolla", "emailena", 1400, 1600, 6, 3, 1, 2, 3);

            reservationRepository.save(reservationbowl1);
            reservationRepository.save(reservationbowl2);

            ArrayList<Bowlingball> listOfBowlingballs = new ArrayList<>();
            listOfBowlingballs.add(new Bowlingball(20, 12));
            listOfBowlingballs.add(new Bowlingball(20, 14));
            listOfBowlingballs.add(new Bowlingball(20, 16));
            listOfBowlingballs.add(new Bowlingball(20, 18));
            listOfBowlingballs.add(new Bowlingball(20, 20));
            equipmentRepository.saveAll(listOfBowlingballs);

            Bowlingcones bowlingcones = new Bowlingcones(100);
            equipmentRepository.save(bowlingcones);

            Hockeyhandles hockeyhandles = new Hockeyhandles(30);
            equipmentRepository.save(hockeyhandles);

            Hockeypuk hockeypuks = new Hockeypuk(16);
            equipmentRepository.save(hockeypuks);

            ArrayList<Shoes> listOfShoes = new ArrayList<>();
            listOfShoes.add(new Shoes(5, 30));
            listOfShoes.add(new Shoes(5, 34));
            listOfShoes.add(new Shoes(5, 38));
            listOfShoes.add(new Shoes(5, 42));
            listOfShoes.add(new Shoes(5, 46));
            equipmentRepository.saveAll(listOfShoes);






        });
    }

}
