package com.example.xpbowling.employee.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String name;

    private LocalDate start;
    private LocalDate endd;


    public Employee(String name, LocalDate start, LocalDate endd) {
        this.name = name;
        this.start = start;
        this.endd = endd;
    }
}
