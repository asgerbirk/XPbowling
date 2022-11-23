package com.example.xpbowling.bowlingLane.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@ToString
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
