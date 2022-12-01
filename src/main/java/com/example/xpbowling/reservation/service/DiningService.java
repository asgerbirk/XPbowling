package com.example.xpbowling.reservation.service;
;
import com.example.xpbowling.reservation.model.DiningReservation;
import com.example.xpbowling.reservation.repository.DiningRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiningService {


    private final DiningRepository diningRepository;

    public DiningService(DiningRepository diningRepository) {
        this.diningRepository = diningRepository;
    }

    public List<DiningReservation> getAllDiningReservations(){
        return diningRepository.findAll();
    }

    public DiningReservation findById(Long id){
        return diningRepository.findById(id).orElseThrow(() -> new IllegalStateException("Fandt ingen reservation med det ID"));
    }

    public DiningReservation updateReservation (Long id, DiningReservation diningReservation){
        return diningRepository.save(diningReservation);
    }

    public void deleteReservation(Long id){
        boolean checkIfReservationExists = diningRepository.existsById(id);
        if (!checkIfReservationExists){
            throw new IllegalStateException("does not exists " + id);
        }
        diningRepository.deleteById(id);
    }

}
