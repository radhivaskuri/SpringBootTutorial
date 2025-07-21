package com.codeWithSrujana.implementation.repository;

import com.codeWithSrujana.implementation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username); // used in login
}