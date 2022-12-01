package com.example.xpbowling.reservation.repository;

import com.example.xpbowling.reservation.model.BowlingReservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface BowlingRepository extends JpaRepository<BowlingReservation, Long> {

    public List<BowlingReservation> findBowlingReservationByDate(LocalDate date);

    public BowlingReservation findByEmail(String email);
}
