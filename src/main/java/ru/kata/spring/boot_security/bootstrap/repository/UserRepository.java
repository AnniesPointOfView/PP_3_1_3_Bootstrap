package ru.kata.spring.boot_security.bootstrap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kata.spring.boot_security.bootstrap.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
