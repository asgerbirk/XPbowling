package com.example.xpbowling.reservation.repository;

import com.example.xpbowling.reservation.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    public Reservation findByEmail(String email);


}
