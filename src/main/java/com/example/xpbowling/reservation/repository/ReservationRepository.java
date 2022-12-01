package com.example.xpbowling.reservation.repository;

import com.example.xpbowling.reservation.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    public List<Reservation> findReservationByDate(LocalDate date);
    public Reservation findByEmail(String email);

}
