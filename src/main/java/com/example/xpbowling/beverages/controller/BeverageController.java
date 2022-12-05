package com.example.xpbowling.beverages.controller;

import com.example.xpbowling.beverages.model.Beverages;
import com.example.xpbowling.beverages.service.BeverageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/beverages")

public class BeverageController {

    private final BeverageService beverageService;

    public BeverageController(BeverageService beverageService){
        this.beverageService = beverageService;
    }

    @GetMapping
    public ResponseEntity<List<Beverages>> getAllEquipment(){
        return ResponseEntity.ok().body(beverageService.getAllBeverages());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Beverages> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(beverageService.findById(id));
    }

    @PutMapping("/{id}")
    ResponseEntity<Beverages> update(@PathVariable Long id, @Valid @RequestBody Beverages beverages){
        return ResponseEntity.ok().body(beverageService.updateBeverages(id, beverages));
    }


    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteBeverage(@PathVariable("id") Long id){
        beverageService.deleteBeverage(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
