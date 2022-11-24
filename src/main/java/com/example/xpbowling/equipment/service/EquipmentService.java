package com.example.xpbowling.equipment.service;

import com.example.xpbowling.equipment.model.*;
import com.example.xpbowling.equipment.repository.EquipmentRepository;
import com.example.xpbowling.reservation.model.Reservation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EquipmentService {

    private final EquipmentRepository equipmentRepository;

    public EquipmentService(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    public List<Equipment> getAllEquipment(){
        return equipmentRepository.findAll();
    }

    public Equipment findById(Long id){
        return equipmentRepository.findById(id).orElseThrow(() -> new IllegalStateException("no equipment with that id " + id));
    }

    public List<Equipment> getAllBowlingballs(){
        return equipmentRepository.findAll().stream().filter(equipment -> equipment instanceof Bowlingball).collect(Collectors.toList());
    }

    public List<Equipment> getAllBowlingcones(){
        return equipmentRepository.findAll().stream().filter(equipment -> equipment instanceof Bowlingcones).collect(Collectors.toList());
    }

    public List<Equipment> getAllHockeyhandles(){
        return equipmentRepository.findAll().stream().filter(equipment -> equipment instanceof Hockeyhandles).collect(Collectors.toList());
    }

    public List<Equipment> getAllHockeypuks(){
        return equipmentRepository.findAll().stream().filter(equipment -> equipment instanceof Hockeypuk).collect(Collectors.toList());
    }

    public List<Equipment> getAllShoes(){
        return equipmentRepository.findAll().stream().filter(equipment -> equipment instanceof Shoes).collect(Collectors.toList());
    }

    public Bowlingball createBowlingball(Bowlingball equipment){
        return equipmentRepository.save(equipment);
    }

    public Bowlingcones createBowlingcones(Bowlingcones equipment){
        return equipmentRepository.save(equipment);
    }

    public Hockeyhandles createHockeyhandles(Hockeyhandles equipment){
        return equipmentRepository.save(equipment);
    }

    public Hockeypuk createHockeypuk(Hockeypuk equipment){
        return equipmentRepository.save(equipment);
    }

    public Shoes createShoes(Shoes equipment){
        return equipmentRepository.save(equipment);
    }

    public void deleteEquipment(Long id){
        boolean checkIfEquipmentExists = equipmentRepository.existsById(id);
        if(!checkIfEquipmentExists){
            throw new IllegalStateException("does not exist " + id);
        }
        equipmentRepository.deleteById(id);
    }

    public Equipment updateEquipment(Long id, Equipment equipment){
        return equipmentRepository.save(equipment);
    }

}

