package com.example.xpbowling;

import com.example.xpbowling.airhockeyTable.model.AirHockeyTable;
import com.example.xpbowling.airhockeyTable.repository.AirHockeyTableRepository;
import com.example.xpbowling.bowlingLane.model.BowlingLane;
import com.example.xpbowling.bowlingLane.repository.BowlingLaneRepository;
import com.example.xpbowling.diningTable.model.DiningTable;
import com.example.xpbowling.diningTable.repository.DiningTableRepository;
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
import java.util.List;

@SpringBootApplication
public class XPbowlingApplication {

    public static void main(String[] args) {
        SpringApplication.run(XPbowlingApplication.class, args);
    }

    @Bean
    public CommandLineRunner importData(ReservationRepository reservationRepository,
                                        EquipmentRepository equipmentRepository,
                                        BowlingLaneRepository bowlingLaneRepository,
                                        AirHockeyTableRepository airHockeyTableRepository,
                                        DiningTableRepository diningTableRepository){
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


            List<BowlingLane> bowlingLaneList = new ArrayList<>();
            bowlingLaneList.add(new BowlingLane(1,false));
            bowlingLaneList.add(new BowlingLane(2,false));
            bowlingLaneList.add(new BowlingLane(3,false));
            bowlingLaneList.add(new BowlingLane(4,false));
            bowlingLaneList.add(new BowlingLane(5,false));
            bowlingLaneList.add(new BowlingLane(6,false));
            bowlingLaneList.add(new BowlingLane(7,false));
            bowlingLaneList.add(new BowlingLane(8,false));
            bowlingLaneList.add(new BowlingLane(9,false));
            bowlingLaneList.add(new BowlingLane(10,false));
            bowlingLaneList.add(new BowlingLane(11,false));
            bowlingLaneList.add(new BowlingLane(12,false));
            bowlingLaneList.add(new BowlingLane(13,false));
            bowlingLaneList.add(new BowlingLane(14,false));
            bowlingLaneList.add(new BowlingLane(15,false));
            bowlingLaneList.add(new BowlingLane(16,false));
            bowlingLaneList.add(new BowlingLane(17,false));
            bowlingLaneList.add(new BowlingLane(18,false));
            bowlingLaneList.add(new BowlingLane(19,false));
            bowlingLaneList.add(new BowlingLane(20,false));
            bowlingLaneList.add(new BowlingLane(21,true));
            bowlingLaneList.add(new BowlingLane(22,true));
            bowlingLaneList.add(new BowlingLane(23,true));
            bowlingLaneList.add(new BowlingLane(24,true));
            bowlingLaneRepository.saveAll(bowlingLaneList);

            List<AirHockeyTable> airHockeyTableList = new ArrayList<>();
            airHockeyTableList.add(new AirHockeyTable(1));
            airHockeyTableList.add(new AirHockeyTable(2));
            airHockeyTableList.add(new AirHockeyTable(3));
            airHockeyTableList.add(new AirHockeyTable(4));
            airHockeyTableRepository.saveAll(airHockeyTableList);


            List<DiningTable> diningTableList = new ArrayList<>();
            diningTableList.add(new DiningTable(1));
            diningTableList.add(new DiningTable(2));
            diningTableList.add(new DiningTable(3));
            diningTableList.add(new DiningTable(4));
            diningTableList.add(new DiningTable(5));
            diningTableList.add(new DiningTable(6));
            diningTableRepository.saveAll(diningTableList);








        });
    }

}
