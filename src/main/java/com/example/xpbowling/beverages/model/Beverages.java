package com.example.xpbowling.beverages.model;


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
public class Beverages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String name;
    private int price;
    private String description;

    private String imgURL;

    public Beverages(String name, int price, String description, String imgURL) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.imgURL = imgURL;
    }
}
