package com.example.xpbowling.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.xpbowling.user.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
