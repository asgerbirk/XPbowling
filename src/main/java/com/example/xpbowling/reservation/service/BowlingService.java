package com.example.xpbowling.reservation.service;

import com.example.xpbowling.reservation.model.BowlingReservation;
import com.example.xpbowling.reservation.repository.BowlingRepository;

import java.util.List;

public class BowlingService {

    private final BowlingRepository bowlingRepository;

    public BowlingService(BowlingRepository bowlingRepository) {
        this.bowlingRepository = bowlingRepository;
    }

    public List<BowlingReservation> getAllBowlingReservations(){
        return bowlingRepository.findAll();
    }

    public BowlingReservation findById(Long id){
        return bowlingRepository.findById(id).orElseThrow(() -> new IllegalStateException("Fandt ingen reservation med det ID"));
    }

    public BowlingReservation updateReservation (Long id, BowlingReservation bowlingReservation){
        return bowlingReservation.save(bowlingReservation);
    }

}
