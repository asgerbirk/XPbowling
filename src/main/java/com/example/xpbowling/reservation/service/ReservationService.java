package com.example.xpbowling.reservation.service;

import com.example.xpbowling.bowlingLane.model.BowlingLane;
import com.example.xpbowling.bowlingLane.service.BowlingLaneService;
import com.example.xpbowling.reservation.model.Reservation;
import com.example.xpbowling.reservation.repository.ReservationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getAllReservations(){
        return reservationRepository.findAll();
    }

    public Reservation findById(Long id){
        return reservationRepository.findById(id).orElseThrow(()->new IllegalStateException("no rider with that id" + id));
    }

    public Reservation updateReservation(Long id, Reservation reservation){
        return reservationRepository.save(reservation);
    }

    public Reservation createReservation(Reservation reservation){
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(Long id){
        boolean checkIfReservationExists = reservationRepository.existsById(id);
        if (!checkIfReservationExists){
            throw new IllegalStateException("does not exists " + id);
        }
        reservationRepository.deleteById(id);
    }



}
