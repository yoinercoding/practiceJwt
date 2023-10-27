package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Boolean exitsByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    boolean exitsByUsername(String username);
}
