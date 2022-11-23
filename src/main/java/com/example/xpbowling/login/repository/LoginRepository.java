package com.example.xpbowling.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.xpbowling.login.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
