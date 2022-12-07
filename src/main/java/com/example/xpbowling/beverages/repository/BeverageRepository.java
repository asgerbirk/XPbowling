package com.example.xpbowling.beverages.repository;

import com.example.xpbowling.beverages.model.Beverages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeverageRepository extends JpaRepository<Beverages, Long> {
}
