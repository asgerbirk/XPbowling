package com.example.xpbowling;

import com.example.xpbowling.airhockeyTable.model.AirHockeyTable;
import com.example.xpbowling.airhockeyTable.repository.AirHockeyTableRepository;
import com.example.xpbowling.bowlingLane.model.BowlingLane;
import com.example.xpbowling.bowlingLane.repository.BowlingLaneRepository;
import com.example.xpbowling.diningTable.model.DiningTable;
import com.example.xpbowling.diningTable.repository.DiningTableRepository;
import com.example.xpbowling.equipment.model.*;
import com.example.xpbowling.equipment.repository.EquipmentRepository;
import com.example.xpbowling.reservation.model.AirhockeyReservation;
import com.example.xpbowling.reservation.model.BowlingReservation;
import com.example.xpbowling.reservation.model.DiningReservation;
import com.example.xpbowling.reservation.repository.AirhockeyRepository;
import com.example.xpbowling.reservation.repository.BowlingRepository;
import com.example.xpbowling.reservation.repository.DiningRepository;
import com.example.xpbowling.reservation.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static com.example.xpbowling.equipment.model.EquipmentType.*;
import static com.example.xpbowling.reservation.model.ReservationType.*;

@SpringBootApplication
public class XPbowlingApplication {

    public static void main(String[] args) {
        SpringApplication.run(XPbowlingApplication.class, args);
    }

    @Bean
    public CommandLineRunner importData(ReservationRepository reservationRepository,
                                        BowlingRepository bowlingRepository,
                                        DiningRepository diningRepository,
                                        AirhockeyRepository airhockeyRepository,
                                        EquipmentRepository equipmentRepository,
                                        BowlingLaneRepository bowlingLaneRepository,
                                        AirHockeyTableRepository airHockeyTableRepository,
                                        DiningTableRepository diningTableRepository){
        return (args -> {
            final List<BowlingReservation> allReservations = new ArrayList<>();
            allReservations.add(new BowlingReservation("Bollamolla", "email", LocalTime.of(12, 0), LocalTime.of(13, 0), LocalDate.now(), 4, 4,3,BOWLING));
            allReservations.add(new BowlingReservation("meerwaldt", "asdasdasa", LocalTime.of(18, 0), LocalTime.of(19, 0), LocalDate.now(), 4, 4,3,BOWLING));
            allReservations.add(new BowlingReservation("smash", "dasdas", LocalTime.of(14, 0), LocalTime.of(15, 0), LocalDate.now(), 4, 4,3,BOWLING));
            bowlingRepository.saveAll(allReservations);





            AirhockeyReservation reservationair1 = new AirhockeyReservation("bonnievilhockey", "maildan", LocalTime.now(), LocalTime.now(), LocalDate.now(), 2, 2);
            AirhockeyReservation reservationair2 = new AirhockeyReservation("lonnievilhockey", "mailban", LocalTime.now(), LocalTime.now(), LocalDate.now(), 2, 1);
            //reservationair1.setType(AIRHOCKEY.name());
            //reservationair2.setType(AIRHOCKEY.name());
            airhockeyRepository.save(reservationair1);
            airhockeyRepository.save(reservationair2);

            DiningReservation reservationdining1 = new DiningReservation("madmanden", "madmail", LocalTime.of(17,00), LocalTime.of(19,00), LocalDate.now(), 6, 2);
            DiningReservation reservationdining2 = new DiningReservation("dessertmanden", "dessertmail", LocalTime.of(17, 0), LocalTime.of(19, 00), LocalDate.now(),  6, 4);
            reservationdining1.setType(SPISNING.name());
            reservationdining2.setType(SPISNING.name());
            diningRepository.save(reservationdining1);
            diningRepository.save(reservationdining2);

            final List<Equipment> equipmentList = new ArrayList<>();

            equipmentList.add(new Equipment(BOWLINGBALL, 10, 10,"yellow"));
            equipmentList.add(new Equipment(BOWLINGBALL, 10, 11,"yellow"));
            equipmentList.add(new Equipment(BOWLINGBALL, 10, 12,"yellow"));
            equipmentList.add(new Equipment(BOWLINGBALL, 25, 7,"blue"));
            equipmentList.add(new Equipment(BOWLINGBALL, 25, 8,"blue"));
            equipmentList.add(new Equipment(BOWLINGBALL, 22, 12,"green"));
            equipmentList.add(new Equipment(BOWLINGBALL, 22, 13,"green"));
            equipmentList.add(new Equipment(BOWLINGBALL, 35, 14,"white"));
            equipmentList.add(new Equipment(BOWLINGBALL, 35, 15,"white"));
            equipmentList.add(new Equipment(BOWLINGBALL, 12, 5,"brown"));
            equipmentList.add(new Equipment(BOWLINGBALL, 12, 6,"brown"));
            equipmentList.add(new Equipment(BOWLINGBALL, 45, 16,"purple"));
            equipmentList.add(new Equipment(BOWLINGBALL, 45, 17,"purple"));

            equipmentList.add(new Equipment(BOWLINGCONES, 45, 1,"white"));

            equipmentList.add(new Equipment(HOCKEYPUK, 10, 1,"white"));

            equipmentList.add(new Equipment(SHOES, 4, 35,"white"));
            equipmentList.add(new Equipment(SHOES, 5, 36,"white"));
            equipmentList.add(new Equipment(SHOES, 7, 37,"white"));
            equipmentList.add(new Equipment(SHOES, 8, 38,"white"));
            equipmentList.add(new Equipment(SHOES, 10, 39,"white"));
            equipmentList.add(new Equipment(SHOES, 12, 40,"white"));
            equipmentList.add(new Equipment(SHOES, 15, 41,"white"));
            equipmentList.add(new Equipment(SHOES, 20, 42,"white"));
            equipmentList.add(new Equipment(SHOES, 33, 43,"white"));
            equipmentList.add(new Equipment(SHOES, 36, 44,"white"));
            equipmentList.add(new Equipment(SHOES, 12, 45,"white"));
            equipmentList.add(new Equipment(SHOES, 10, 46,"white"));
            equipmentList.add(new Equipment(SHOES, 10, 47,"white"));
            equipmentList.add(new Equipment(SHOES, 12, 48,"white"));

            equipmentList.add(new Equipment(SHOES, 4, 35,"black"));
            equipmentList.add(new Equipment(SHOES, 5, 36,"black"));
            equipmentList.add(new Equipment(SHOES, 7, 37,"black"));
            equipmentList.add(new Equipment(SHOES, 8, 38,"black"));
            equipmentList.add(new Equipment(SHOES, 10, 39,"black"));
            equipmentList.add(new Equipment(SHOES, 12, 40,"black"));
            equipmentList.add(new Equipment(SHOES, 15, 41,"black"));
            equipmentList.add(new Equipment(SHOES, 20, 42,"black"));
            equipmentList.add(new Equipment(SHOES, 33, 43,"black"));
            equipmentList.add(new Equipment(SHOES, 36, 44,"black"));
            equipmentList.add(new Equipment(SHOES, 12, 45,"black"));
            equipmentList.add(new Equipment(SHOES, 10, 46,"black"));
            equipmentList.add(new Equipment(SHOES, 10, 47,"black"));
            equipmentList.add(new Equipment(SHOES, 12, 48,"black"));
            equipmentRepository.saveAll(equipmentList);












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
