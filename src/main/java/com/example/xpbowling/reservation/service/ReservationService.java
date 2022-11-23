package com.example.xpbowling.reservation.service;

import com.example.xpbowling.reservation.model.BowlingReservation;
import com.example.xpbowling.reservation.model.Reservation;
import com.example.xpbowling.reservation.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<Reservation> getAllBowlingReservations(){
        return reservationRepository.findAll().stream().filter(item -> item instanceof BowlingReservation).collect(Collectors.toList());
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
