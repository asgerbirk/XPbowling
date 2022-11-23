package com.example.xpbowling.diningTable.repository;

import com.example.xpbowling.diningTable.model.DiningTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiningTableRepository extends JpaRepository <DiningTable, Long> {
}
