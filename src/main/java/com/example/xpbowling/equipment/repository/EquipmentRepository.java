package com.example.xpbowling.equipment.repository;

import com.example.xpbowling.equipment.model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
}
