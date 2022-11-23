package com.example.xpbowling.reservation.model;

import com.example.xpbowling.bowlingLane.model.BowlingLane;
import lombok.*;
import org.hibernate.mapping.Set;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
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

    @ManyToMany(mappedBy = "bowlingReservationSet")
    private List<BowlingLane> bowlingLaneSet;

    public BowlingReservation(String name, String email, double reservationStart, double reservationEnd, int numberOfPeople, int countOfLanes, int laneNum1) {
        super(name, email, reservationStart, reservationEnd, numberOfPeople);
        this.countOfLanes = countOfLanes;
        this.laneNum1 = laneNum1;
    }

    public BowlingReservation(String name, String email, double reservationStart, double reservationEnd, int numberOfPeople, int countOfLanes, List<BowlingLane> bowlingLaneSet) {
        super(name, email, reservationStart, reservationEnd, numberOfPeople);
        this.countOfLanes = countOfLanes;
        this.bowlingLaneSet = bowlingLaneSet;
    }

    public BowlingReservation(String name, String email, double reservationStart, double reservationEnd, int numberOfPeople, int countOfLanes, int laneNum1, int laneNum2) {
        super(name, email, reservationStart, reservationEnd, numberOfPeople);
        this.countOfLanes = countOfLanes;
        this.laneNum1 = laneNum1;
        this.laneNum2 = laneNum2;
    }
    public BowlingReservation(String name, String email, double reservationStart, double reservationEnd, int numberOfPeople, int countOfLanes, int laneNum1, int laneNum2, int laneNum3) {
        super(name, email, reservationStart, reservationEnd, numberOfPeople);
        this.countOfLanes = countOfLanes;
        this.laneNum1 = laneNum1;
        this.laneNum2 = laneNum2;
        this.laneNum3 = laneNum3;

    }
    public BowlingReservation(String name, String email, double reservationStart, double reservationEnd, int numberOfPeople, int countOfLanes, int laneNum1, int laneNum2, int laneNum3, int laneNum4) {
        super(name, email, reservationStart, reservationEnd, numberOfPeople);
        this.countOfLanes = countOfLanes;
        this.laneNum1 = laneNum1;
        this.laneNum2 = laneNum2;
        this.laneNum3 = laneNum3;
        this.laneNum4 = laneNum4;
    }
}
