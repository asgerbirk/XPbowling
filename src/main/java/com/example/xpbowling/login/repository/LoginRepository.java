package com.example.xpbowling.login.repository;

import com.example.xpbowling.login.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<User,Long> {
}