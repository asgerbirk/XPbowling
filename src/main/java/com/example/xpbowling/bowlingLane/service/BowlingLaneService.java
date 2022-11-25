package com.example.xpbowling.bowlingLane.service;

import com.example.xpbowling.bowlingLane.model.BowlingLane;
import com.example.xpbowling.bowlingLane.repository.BowlingLaneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BowlingLaneService {

    private final BowlingLaneRepository bowlingLaneRepository;


    public BowlingLaneService(BowlingLaneRepository bowlingLaneRepository) {
        this.bowlingLaneRepository = bowlingLaneRepository;
    }

    public List<BowlingLane> getAllBowlingLanes(){
        return bowlingLaneRepository.findAll();
    }

    public BowlingLane findById(Long id){
        return bowlingLaneRepository.findById(id).orElseThrow(()->new IllegalStateException("no  with that id" + id));
    }

    public BowlingLane updateBowlingLane(Long id, BowlingLane bowlingLane){
       return bowlingLaneRepository.save(bowlingLane);
    }

}
