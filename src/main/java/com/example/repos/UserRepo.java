package com.example.repos;

import com.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepo extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}
