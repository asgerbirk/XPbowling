package com.example.xpbowling.reservation.controller;


import com.example.xpbowling.bowlingLane.model.BowlingLane;
import com.example.xpbowling.reservation.model.Reservation;
import com.example.xpbowling.reservation.service.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/reservations")
public class ReservationController {


    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public ResponseEntity<List<Reservation>> getAllReservations(){
        return ResponseEntity.ok().body(reservationService.getAllReservations());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reservation> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(reservationService.findById(id));
    }

    @PutMapping ("/{id}")
    ResponseEntity<Reservation> update(@PathVariable Long id, @Valid @RequestBody Reservation reservation){
        return ResponseEntity.ok().body(reservationService.updateReservation(id, reservation));
    }

    @PostMapping
    public ResponseEntity<Reservation> createReservation(@Valid @RequestBody Reservation reservation){
        return ResponseEntity.ok().body(reservationService.createReservation(reservation));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteReservation(@PathVariable("id") Long id){
        reservationService.deleteReservation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
