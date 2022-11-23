package com.example.xpbowling.schedule.repository;

import com.example.xpbowling.schedule.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
