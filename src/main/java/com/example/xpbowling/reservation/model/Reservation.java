package com.example.xpbowling.reservation.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Reservation {

    @Id
    @Column(nullable = false)
    private Long id;
    private String name;
    private String email;
    private double reservationStart;
    private double reservationEnd;
    private int numberOfPeople;






}
