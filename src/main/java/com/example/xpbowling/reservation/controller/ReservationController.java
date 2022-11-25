package com.example.xpbowling.reservation.controller;


import com.example.xpbowling.reservation.model.AirhockeyReservation;
import com.example.xpbowling.reservation.model.BowlingReservation;
import com.example.xpbowling.reservation.model.DiningReservation;
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

    @GetMapping("/avaliable")
    public ResponseEntity<List<Reservation>> findAvaliableBowlingLanes(){
        return ResponseEntity.ok().body(reservationService.getAvaliableLanes());
    }

    @PutMapping ("/{id}")
    ResponseEntity<Reservation> update(@PathVariable Long id, @Valid @RequestBody Reservation reservation){
        return ResponseEntity.ok().body(reservationService.updateReservation(id, reservation));
    }

    @GetMapping ("/bowlingreservations")
    public ResponseEntity<List<Reservation>> getBowlingReservations(){
        return ResponseEntity.ok().body(reservationService.getAllBowlingReservations());
    }

    @GetMapping("/airhockeyreservations")
    public ResponseEntity<List<Reservation>> getAllAirhockeyReservations(){
        return ResponseEntity.ok().body(reservationService.getAllAirhockeyReservations());
    }

    @GetMapping("/diningreservations")
    public ResponseEntity<List<Reservation>> getAllDiningReservations(){
        return ResponseEntity.ok().body(reservationService.getAllDiningReservations());
    }

    @PostMapping("/bowling") //bowling resrevation parametre her til at kalde fra den rigtige submit knap
    public ResponseEntity<BowlingReservation> createBowlingReservation(@RequestBody BowlingReservation reservation){
        return ResponseEntity.ok().body(reservationService.createBowlingReservation(reservation));
    }

    @PostMapping("/airhockey")
    public ResponseEntity<AirhockeyReservation> createAirhockeyReservation(@RequestBody AirhockeyReservation reservation){
        return ResponseEntity.ok().body(reservationService.createAirhockeyReservation(reservation));
    }

    @PostMapping("/dining")
    public ResponseEntity<DiningReservation> createDiningReservation(@RequestBody DiningReservation reservation){
        return ResponseEntity.ok().body(reservationService.createDiningReservation(reservation));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteReservation(@PathVariable("id") Long id){
        reservationService.deleteReservation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
