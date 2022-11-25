package com.example.xpbowling.reservation.service;

import com.example.xpbowling.reservation.model.AirhockeyReservation;
import com.example.xpbowling.reservation.model.BowlingReservation;
import com.example.xpbowling.reservation.model.DiningReservation;
import com.example.xpbowling.reservation.model.Reservation;
import com.example.xpbowling.reservation.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;
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
        return reservationRepository.findAll().stream().filter(reservation -> reservation instanceof BowlingReservation).collect(Collectors.toList());
    }

    public List<Reservation> getAvaliableLanes(){
        return reservationRepository.findAll().stream().filter(reservation -> !reservation.isBooked()).collect(Collectors.toList());
    }

    public List<Reservation> getAllAirhockeyReservations(){
        return reservationRepository.findAll().stream().filter(item -> item instanceof AirhockeyReservation).collect(Collectors.toList());
    }

    public List<Reservation> getAllDiningReservations(){
        return reservationRepository.findAll().stream().filter(item -> item instanceof DiningReservation).collect(Collectors.toList());
    }

    public BowlingReservation createBowlingReservation(BowlingReservation reservation){
       return reservationRepository.save(reservation);

    }

    public AirhockeyReservation createAirhockeyReservation(AirhockeyReservation reservation){
        return reservationRepository.save(reservation);
    }

    public DiningReservation createDiningReservation(DiningReservation reservation){
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
