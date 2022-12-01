package com.example.xpbowling.reservation.controller;

import com.example.xpbowling.reservation.model.BowlingReservation;
import com.example.xpbowling.reservation.model.DiningReservation;
import com.example.xpbowling.reservation.service.DiningService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/diningReservation")
public class DiningReservationController {



    private final DiningService diningService;

    public DiningReservationController(DiningService diningService) {
        this.diningService = diningService;
    }

    @GetMapping
    public ResponseEntity<List<DiningReservation>> getAllReservations(){
        return ResponseEntity.ok().body(diningService.getAllDiningReservations());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DiningReservation> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(diningService.findById(id));
    }


    @PutMapping("/{id}")
    ResponseEntity<DiningReservation> update(@PathVariable Long id, @Valid @RequestBody DiningReservation diningReservation){
        return ResponseEntity.ok().body(diningService.updateReservation(id,diningReservation));
    }

}
