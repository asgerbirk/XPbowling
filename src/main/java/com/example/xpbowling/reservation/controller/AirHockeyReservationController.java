package com.example.xpbowling.reservation.controller;

import com.example.xpbowling.reservation.model.AirhockeyReservation;
import com.example.xpbowling.reservation.model.BowlingReservation;
import com.example.xpbowling.reservation.service.AirhockeyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/airhockeyReservation")
public class AirHockeyReservationController {

    private final AirhockeyService airhockeyService;


    public AirHockeyReservationController(AirhockeyService airhockeyService) {
        this.airhockeyService = airhockeyService;
    }

    @GetMapping
    public ResponseEntity<List<AirhockeyReservation>> getAllReservations(){
        return ResponseEntity.ok().body(airhockeyService.getAllAirhockeyReservations());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AirhockeyReservation> findById(@PathVariable("id")Long id){
        return ResponseEntity.ok().body(airhockeyService.findById(id));
    }

    @PutMapping ("/{id}")
    ResponseEntity<AirhockeyReservation> update(@PathVariable Long id, @Valid @RequestBody AirhockeyReservation airhockeyReservation){
        return ResponseEntity.ok().body(airhockeyService.updateReservation(id,airhockeyReservation));
    }

}
