package com.example.xpbowling.reservation.repository;

import com.example.xpbowling.reservation.model.AirhockeyReservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AirhockeyRepository extends JpaRepository<AirhockeyReservation, Long> {

    public List<AirhockeyReservation> findAirhockeyReservationByDate(LocalDate date);

    public AirhockeyReservation findByEmail(String email);

}
