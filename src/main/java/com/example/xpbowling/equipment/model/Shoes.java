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
public class Shoes extends Equipment{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private int shoeSize;

    public Shoes(int numOfEntities, int shoeSize) {
        super(numOfEntities);
        this.shoeSize = shoeSize;
    }
}
