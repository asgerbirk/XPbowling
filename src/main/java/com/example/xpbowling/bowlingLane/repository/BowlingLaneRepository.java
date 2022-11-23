package com.example.xpbowling.bowlingLane.repository;

import com.example.xpbowling.bowlingLane.model.BowlingLane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BowlingLaneRepository extends JpaRepository<BowlingLane, Long> {
}
