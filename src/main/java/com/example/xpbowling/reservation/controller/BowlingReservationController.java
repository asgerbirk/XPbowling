package com.example.xpbowling.reservation.controller;


import com.example.xpbowling.reservation.model.BowlingReservation;
import com.example.xpbowling.reservation.model.Reservation;
import com.example.xpbowling.reservation.service.BowlingService;
import com.example.xpbowling.reservation.service.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/bowlingReservation")
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

    @PostMapping //bowling resrevation parametre her til at kalde fra den rigtige submit knap
    public ResponseEntity<BowlingReservation> createBowlingReservation(@RequestBody BowlingReservation reservation){
        return ResponseEntity.ok().body(bowlingService.create(reservation));
    }


    @PutMapping ("/{id}")
    ResponseEntity<BowlingReservation> update(@PathVariable Long id, @Valid @RequestBody BowlingReservation bowlingReservation){
        return ResponseEntity.ok().body(bowlingService.updateReservation(id,bowlingReservation));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteReservation(@PathVariable("id") Long id){
        bowlingService.deleteReservation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
