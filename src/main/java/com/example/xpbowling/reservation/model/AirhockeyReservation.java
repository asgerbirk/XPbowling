package com.example.xpbowling.reservation.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class AirhockeyReservation{


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
    private int tableNum;

    private ReservationType type;

    public AirhockeyReservation(String name, String email, LocalTime reservationStart, LocalTime reservationEnd, LocalDate date, int numberOfPeople, int tableNum) {
        this.name = name;
        this.email = email;
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
        this.date = date;
        this.numberOfPeople = numberOfPeople;
        this.tableNum = tableNum;
    }
}
