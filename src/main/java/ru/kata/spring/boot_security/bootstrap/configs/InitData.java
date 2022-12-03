package ru.kata.spring.boot_security.bootstrap.configs;

import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.bootstrap.model.Role;
import ru.kata.spring.boot_security.bootstrap.model.User;
import ru.kata.spring.boot_security.bootstrap.service.RoleService;
import ru.kata.spring.boot_security.bootstrap.service.UserService;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class InitData {
    private final UserService userService;
    private final RoleService roleService;

    public InitData(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    private void init() {

        // roles
        Role adminRole = new Role("ROLE_ADMIN");
        Role userRole = new Role("ROLE_USER");
        roleService.createRole(adminRole);
        roleService.createRole(userRole);

        Set<Role> userRoles = new HashSet<>();
        Set<Role> adminRoles = new HashSet<>();
        userRoles.add(userRole);
        adminRoles.add(userRole);
        adminRoles.add(adminRole);

        // users
        User adminUser = new User("Phill",
                "Collins",
                "admin@g.com",
                "admin@g.com",
                "admin");
        adminUser.setRoles(adminRoles);

        User user = new User("Adam",
                "Robbins",
                "user@g.com",
                "user@g.com",
                "user");
        user.setRoles(userRoles);

        userService.saveUser(adminUser);
        userService.saveUser(user);
    }
}
