package com.example.xpbowling.reservation.service;

import com.example.xpbowling.reservation.model.BowlingReservation;
import com.example.xpbowling.reservation.model.ReservationType;
import com.example.xpbowling.reservation.repository.BowlingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    public BowlingReservation create(BowlingReservation bowlingReservation){
        bowlingReservation.setReservationType(ReservationType.BOWLING);
        return bowlingRepository.save(bowlingReservation);
    }

    public BowlingReservation updateReservation (Long id, BowlingReservation bowlingReservation){
        return bowlingRepository.save(bowlingReservation);
    }

    public void deleteReservation(Long id){
        boolean checkIfReservationExists = bowlingRepository.existsById(id);
        if (!checkIfReservationExists){
            throw new IllegalStateException("does not exists " + id);
        }
        bowlingRepository.deleteById(id);
    }

}
