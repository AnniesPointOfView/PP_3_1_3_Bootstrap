package ru.kata.spring.boot_security.bootstrap.service;

import ru.kata.spring.boot_security.bootstrap.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAllRoles();
    List<Role> findAllRolesById(Long[] rolesId);
    void createRole(Role role);
}
