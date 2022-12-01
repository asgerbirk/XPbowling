package com.example.xpbowling.reservation.repository;

import com.example.xpbowling.reservation.model.DiningReservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface DiningRepository extends JpaRepository<DiningReservation, Long> {

    public List<DiningReservation> findDiningReservationByDate(LocalDate date);

    public DiningReservation findByEmail(String email);
}
