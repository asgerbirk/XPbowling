package com.example.xpbowling.equipment.controller;

import com.example.xpbowling.equipment.model.*;
import com.example.xpbowling.equipment.service.EquipmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/equipment")
public class EquipmentController {

    private final EquipmentService equipmentService;


    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @GetMapping
    public ResponseEntity<List<Equipment>> getAllEquipment(){
        return ResponseEntity.ok().body(equipmentService.getAllEquipment());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Equipment> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(equipmentService.findById(id));
    }

    @PutMapping("/{id}")
    ResponseEntity<Equipment> update(@PathVariable Long id, @Valid @RequestBody Equipment equipment){
        return ResponseEntity.ok().body(equipmentService.updateEquipment(id, equipment));
    }

    @GetMapping("/bowlingball")
    public ResponseEntity<List<Equipment>> getBowlingballs(){
        return ResponseEntity.ok().body(equipmentService.getAllBowlingballs());
    }

    @GetMapping("/bowlingcone")
    public ResponseEntity<List<Equipment>> getAllBowlingcones(){
        return ResponseEntity.ok().body(equipmentService.getAllBowlingcones());
    }

    @GetMapping("/hockeyhandle")
    public ResponseEntity<List<Equipment>> getAllHockeyhandles(){
        return ResponseEntity.ok().body(equipmentService.getAllHockeyhandles());
    }

    @GetMapping("/hockeypuk")
    public ResponseEntity<List<Equipment>> getAllHockeypuks(){
        return ResponseEntity.ok().body(equipmentService.getAllHockeypuks());
    }

    @GetMapping("/shoes")
    public ResponseEntity<List<Equipment>> getAllShoes(){
        return ResponseEntity.ok().body(equipmentService.getAllShoes());
    }

    @PostMapping("/bowlingball")
    public ResponseEntity<Bowlingball> createBowlingball(@RequestBody Bowlingball equipment){
        return ResponseEntity.ok().body(equipmentService.createBowlingball(equipment));
    }

    @PostMapping("/bowlingcone")
    public ResponseEntity<Bowlingcones> createBowlingcone(@RequestBody Bowlingcones equipment){
        return ResponseEntity.ok().body(equipmentService.createBowlingcones(equipment));
    }

    @PostMapping("/hockeyhandle")
    public ResponseEntity<Hockeyhandles> createHockeyhandle(@RequestBody Hockeyhandles equipment){
        return ResponseEntity.ok().body(equipmentService.createHockeyhandles(equipment));
    }

    @PostMapping("/hockeypuk")
    public ResponseEntity<Hockeypuk> createHockeypuk(@RequestBody Hockeypuk equipment){
        return ResponseEntity.ok().body(equipmentService.createHockeypuk(equipment));
    }

    @PostMapping("/shoes")
    public ResponseEntity<Shoes> create(@RequestBody Shoes equipment){
        return ResponseEntity.ok().body(equipmentService.createShoes(equipment));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteEquipment(@PathVariable("id") Long id){
        equipmentService.deleteEquipment(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
