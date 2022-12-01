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

public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Enumerated(EnumType.STRING)
    private EquipmentType equipmentType;
    private int number;
    private int size;
    private String color;

    public Equipment(EquipmentType equipmentType, int number, int size, String color) {
        this.equipmentType = equipmentType;
        this.number = number;
        this.size = size;
        this.color = color;
    }
}




