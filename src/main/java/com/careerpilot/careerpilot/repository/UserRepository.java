package com.careerpilot.careerpilot.repository;

import com.careerpilot.careerpilot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}