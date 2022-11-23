package com.example.xpbowling.bowlingLane.controller;

import com.example.xpbowling.bowlingLane.model.BowlingLane;
import com.example.xpbowling.bowlingLane.service.BowlingLaneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/bowlingLanes")
public class BowlingLaneController {

    private final BowlingLaneService bowlingLaneService;

    public BowlingLaneController(BowlingLaneService bowlingLaneService) {
        this.bowlingLaneService = bowlingLaneService;
    }

    @GetMapping
    public ResponseEntity<List<BowlingLane>> getAllBowlingLanes(){
        return ResponseEntity.ok().body(bowlingLaneService.getAllBowlingLanes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BowlingLane> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(bowlingLaneService.findById(id));
    }

    @PutMapping ("/{id}")
    ResponseEntity<BowlingLane> update(@PathVariable Long id, @Valid @RequestBody BowlingLane bowlingLane){
        return ResponseEntity.ok().body(bowlingLaneService.updateBowlingLane(id,bowlingLane));
    }
}
