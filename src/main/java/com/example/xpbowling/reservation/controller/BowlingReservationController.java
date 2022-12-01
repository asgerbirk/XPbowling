package com.example.xpbowling.reservation.controller;


import com.example.xpbowling.reservation.model.BowlingReservation;
import com.example.xpbowling.reservation.model.Reservation;
import com.example.xpbowling.reservation.service.BowlingService;
import com.example.xpbowling.reservation.service.ReservationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/reservations/bowling")
public class BowlingReservationController {


    private final BowlingService bowlingService;

    public BowlingReservationController(BowlingService bowlingService) {
        this.bowlingService = bowlingService;
    }

    @GetMapping
    public ResponseEntity<List<BowlingReservation>> getAllReservations(){
        return ResponseEntity.ok().body(bowlingService.getAllBowlingReservations());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BowlingReservation> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(bowlingService.findById(id));
    }


    @PutMapping ("/{id}")
    ResponseEntity<BowlingReservation> update(@PathVariable Long id, @Valid @RequestBody BowlingReservation bowlingReservation){
        return ResponseEntity.ok().body(bowlingService.updateReservation(id,bowlingReservation));
    }

}
