package com.example.xpbowling.reservation.model;

import com.example.xpbowling.bowlingLane.model.BowlingLane;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BowlingReservation{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String name;
    private String email;
    private LocalTime reservationStart;
    private LocalTime reservationEnd;
    private LocalDate date;
    private int numberOfPeople;

    private int countOfLanes;
    private int laneNumber;


    @Enumerated(EnumType.STRING)
    private ReservationType reservationType;




    public BowlingReservation(String name, String email, LocalTime reservationStart, LocalTime reservationEnd, LocalDate date, int numberOfPeople, int countOfLanes, int laneNumber, ReservationType reservationType) {
        this.name = name;
        this.email = email;
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
        this.date = date;
        this.numberOfPeople = numberOfPeople;
        this.countOfLanes = countOfLanes;
        this.laneNumber = laneNumber;
        this.reservationType = reservationType;
    }

    public BowlingReservation(String name, String email, LocalTime reservationStart, LocalTime reservationEnd, LocalDate date, int numberOfPeople, int countOfLanes, int laneNumber) {
        this.name = name;
        this.email = email;
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
        this.date = date;
        this.numberOfPeople = numberOfPeople;
        this.countOfLanes = countOfLanes;
        this.laneNumber = laneNumber;
    }
}
