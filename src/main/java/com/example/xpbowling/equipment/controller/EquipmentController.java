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

    @PostMapping("/createEquipment")
    public ResponseEntity<Equipment> createEquipment(@RequestBody Equipment equipment){
        return ResponseEntity.ok().body(equipmentService.create(equipment));
    }


    @PutMapping("/{id}")
    ResponseEntity<Equipment> update(@PathVariable Long id, @Valid @RequestBody Equipment equipment){
        return ResponseEntity.ok().body(equipmentService.updateEquipment(id, equipment));
    }



    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteEquipment(@PathVariable("id") Long id){
        equipmentService.deleteEquipment(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
