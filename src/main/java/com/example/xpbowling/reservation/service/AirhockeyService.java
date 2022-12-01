package com.example.xpbowling.reservation.service;

import com.example.xpbowling.reservation.model.AirhockeyReservation;
import com.example.xpbowling.reservation.repository.AirhockeyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirhockeyService {

    private final AirhockeyRepository airhockeyRepository;

    public AirhockeyService(AirhockeyRepository airhockeyRepository) {
        this.airhockeyRepository = airhockeyRepository;
    }

    public List<AirhockeyReservation> getAllAirhockeyReservations(){
        return airhockeyRepository.findAll();
    }

    public AirhockeyReservation findById(Long id){
        return airhockeyRepository.findById(id).orElseThrow(() -> new IllegalStateException("Fandt ingen reservation med det ID"));
    }

    public AirhockeyReservation updateReservation (Long id, AirhockeyReservation airhockeyReservation){
        return  airhockeyRepository.save(airhockeyReservation);
    }

    public void deleteReservation(Long id){
        boolean checkIfReservationExists = airhockeyRepository.existsById(id);
        if(!checkIfReservationExists){
            throw new IllegalStateException("Does not exist "+ id);
        }
        airhockeyRepository.deleteById(id);
    }

}
