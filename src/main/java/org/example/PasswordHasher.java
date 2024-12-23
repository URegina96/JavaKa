package org.example;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// этот класс пишет Hashed password на пароль
public class PasswordHasher {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "newpassword123";
        String hashedPassword = encoder.encode(rawPassword);
        System.out.println("Hashed password: " + hashedPassword);
    }
}



