package com.example.xpbowling.reservation.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class AirhockeyReservation extends Reservation{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private int tableNum;

    public AirhockeyReservation(String name, String email, double reservationStart, double reservationEnd, int numberOfPeople, int tableNum) {
        super(name, email, reservationStart, reservationEnd, numberOfPeople);
        this.tableNum = tableNum;
    }
}
