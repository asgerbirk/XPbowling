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

    public Equipment create(Equipment equipment){
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

