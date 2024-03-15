package com.example.tourly.repository;

import com.example.tourly.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    User findByUsername(String username);

    List<User> findAllByUsername(String username);
}
