package org.example.service;

import org.example.bd.User;
import org.example.dto.LoginRequest;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        // Логика регистрации пользователя, например, валидация и сохранение
        return userRepository.save(user);
    }

    public User loginUser(LoginRequest loginRequest) {
        // Логика аутентификации пользователя
        User user = userRepository.findByUsername(loginRequest.getUsername());
        if (user != null && user.getPassword().equals(loginRequest.getPassword())) {
            return user;
        } else {
            throw new RuntimeException("Invalid username or password");
        }
    }
}
