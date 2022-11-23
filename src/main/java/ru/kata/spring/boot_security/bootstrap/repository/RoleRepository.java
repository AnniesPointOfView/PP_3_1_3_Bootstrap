package ru.kata.spring.boot_security.bootstrap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kata.spring.boot_security.bootstrap.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
