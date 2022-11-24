package com.example.xpbowling.reservation.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class DiningReservation extends Reservation{

    private int tableNum;

    public DiningReservation(String name, String email, LocalTime reservationStart, LocalTime reservationEnd, int numberOfPeople, int tableNum) {
        super(name, email, reservationStart, reservationEnd, numberOfPeople);
        this.tableNum = tableNum;
    }
}
