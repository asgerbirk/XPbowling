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
public class BowlingReservation extends Reservation{



    private int countOfLanes;
    private int laneNum1;
    private int laneNum2;
    private int laneNum3;
    private int laneNum4;

    @ManyToMany(mappedBy = "bowlingReservations")
    private List<BowlingLane> bowlingLaneSet = new ArrayList<>();

    public BowlingReservation(String name, String email, LocalTime reservationStart, LocalTime reservationEnd, LocalDate date, int numberOfPeople, boolean isBooked, int countOfLanes, int laneNum1) {
        super(name, email, reservationStart, reservationEnd, date, numberOfPeople, isBooked);
        this.countOfLanes = countOfLanes;
        this.laneNum1 = laneNum1;
    }
    public BowlingReservation(String name, String email, LocalTime reservationStart, LocalTime reservationEnd, LocalDate date, int numberOfPeople,boolean isBooked , int countOfLanes, int laneNum1, int laneNum2) {
        super(name, email, reservationStart, reservationEnd, date, numberOfPeople,isBooked);
        this.countOfLanes = countOfLanes;
        this.laneNum1 = laneNum1;
        this.laneNum2 = laneNum2;
    }
    public BowlingReservation(String name, String email, LocalTime reservationStart, LocalTime reservationEnd, LocalDate date, int numberOfPeople,boolean isBooked ,int countOfLanes, int laneNum1, int laneNum2, int laneNum3) {
        super(name, email, reservationStart, reservationEnd, date, numberOfPeople, isBooked);
        this.countOfLanes = countOfLanes;
        this.laneNum1 = laneNum1;
        this.laneNum2 = laneNum2;
        this.laneNum3 = laneNum3;

    }
    public BowlingReservation(String name, String email, LocalTime reservationStart, LocalTime reservationEnd, LocalDate date, int numberOfPeople,boolean isBooked , int countOfLanes, int laneNum1, int laneNum2, int laneNum3, int laneNum4) {
        super(name, email, reservationStart, reservationEnd, date, numberOfPeople, isBooked);
        this.countOfLanes = countOfLanes;
        this.laneNum1 = laneNum1;
        this.laneNum2 = laneNum2;
        this.laneNum3 = laneNum3;
        this.laneNum4 = laneNum4;
    }
}
