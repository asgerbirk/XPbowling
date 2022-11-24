package com.example.xpbowling.equipment.model;


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
public class Bowlingball extends Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private int ballSize;
    private String ballcolor;

    public Bowlingball(int numOfEntities, int ballSize, String ballcolor) {
        super(numOfEntities);
        this.ballSize = ballSize;
        this.ballcolor = ballcolor;
    }
}
