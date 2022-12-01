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
    private int laneNum1;
    private int laneNum2;
    private int laneNum3;
    private int laneNum4;

    private String type;

    @ManyToMany(mappedBy = "bowlingReservations")
    private List<BowlingLane> bowlingLaneSet = new ArrayList<>();

    public BowlingReservation(String name, String email, LocalTime reservationStart, LocalTime reservationEnd, LocalDate date, int numberOfPeople, int countOfLanes, int laneNum1, int laneNum2, int laneNum3, int laneNum4) {
        this.name = name;
        this.email = email;
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
        this.date = date;
        this.numberOfPeople = numberOfPeople;
        this.countOfLanes = countOfLanes;
        this.laneNum1 = laneNum1;
        this.laneNum2 = laneNum2;
        this.laneNum3 = laneNum3;
        this.laneNum4 = laneNum4;
    }

    public BowlingReservation(String name, String email, LocalTime reservationStart, LocalTime reservationEnd, LocalDate date, int numberOfPeople, int countOfLanes, int laneNum1, int laneNum2, int laneNum3) {
        this.name = name;
        this.email = email;
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
        this.date = date;
        this.numberOfPeople = numberOfPeople;
        this.countOfLanes = countOfLanes;
        this.laneNum1 = laneNum1;
        this.laneNum2 = laneNum2;
        this.laneNum3 = laneNum3;
    }

    public BowlingReservation(String name, String email, LocalTime reservationStart, LocalTime reservationEnd, LocalDate date, int numberOfPeople, int countOfLanes, int laneNum1, int laneNum2) {
        this.name = name;
        this.email = email;
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
        this.date = date;
        this.numberOfPeople = numberOfPeople;
        this.countOfLanes = countOfLanes;
        this.laneNum1 = laneNum1;
        this.laneNum2 = laneNum2;
    }

    public BowlingReservation(String name, String email, LocalTime reservationStart, LocalTime reservationEnd, LocalDate date, int numberOfPeople, int countOfLanes, int laneNum1) {
        this.name = name;
        this.email = email;
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
        this.date = date;
        this.numberOfPeople = numberOfPeople;
        this.countOfLanes = countOfLanes;
        this.laneNum1 = laneNum1;
    }
}
