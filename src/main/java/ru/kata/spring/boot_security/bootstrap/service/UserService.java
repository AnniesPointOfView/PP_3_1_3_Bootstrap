package ru.kata.spring.boot_security.bootstrap.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import ru.kata.spring.boot_security.bootstrap.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> findAllUsers();
    User findById(int id);
    User findByUsername(String username);
    boolean saveUser(User user, BindingResult bindingResult, Model model);
    boolean saveUser(User user);
    void updateUser(int id, User user);
    void deleteUser(int id);
}
