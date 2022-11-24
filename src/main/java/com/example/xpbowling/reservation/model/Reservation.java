package com.example.xpbowling.reservation.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
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
    private int numberOfPeople;


    public Reservation(String name, String email, LocalTime reservationStart, LocalTime reservationEnd, int numberOfPeople) {
        this.name = name;
        this.email = email;
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
        this.numberOfPeople = numberOfPeople;
    }


}
