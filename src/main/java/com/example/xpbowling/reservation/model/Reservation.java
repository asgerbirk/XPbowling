package com.example.xpbowling.reservation.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Reservation {

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



    public Reservation(String name, String email, LocalTime reservationStart, LocalTime reservationEnd, LocalDate date, int numberOfPeople) {
        this.name = name;
        this.email = email;
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
        this.date = date;
        this.numberOfPeople = numberOfPeople;

    }
}
