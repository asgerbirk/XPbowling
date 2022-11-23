package com.example.xpbowling.reservation.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class BowlingReservation extends Reservation{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private int countOfLanes;
    private int laneNum1;
    private int laneNum2;
    private int laneNum3;
    private int laneNum4;

    public BowlingReservation(String name, String email, double reservationStart, double reservationEnd, int numberOfPeople, int countOfLanes, int laneNum1) {
        super(name, email, reservationStart, reservationEnd, numberOfPeople);
        this.countOfLanes = countOfLanes;
        this.laneNum1 = laneNum1;
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
