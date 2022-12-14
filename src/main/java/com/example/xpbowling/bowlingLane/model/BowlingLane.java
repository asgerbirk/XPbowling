package com.example.xpbowling.bowlingLane.model;

import com.example.xpbowling.reservation.model.BowlingReservation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.mapping.Set;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class BowlingLane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int bowlingLaneNumber;

    private boolean suitedForKids;




    public BowlingLane(int bowlingLaneNumber, boolean suitedForKids) {
        this.bowlingLaneNumber = bowlingLaneNumber;
        this.suitedForKids = suitedForKids;
    }


}
