
package com.pradip.inventory.service;

import com.pradip.inventory.entity.AppUser;
import com.pradip.inventory.repository.AppUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final AppUserRepository appUserRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(
            AppUserRepository appUserRepository,
            PasswordEncoder passwordEncoder) {
        this.appUserRepository = appUserRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public AppUser register(String username, String password) {

        String cleanUsername = username.trim();

        if (cleanUsername.isEmpty()) {
            throw new IllegalArgumentException("Username is required");
        }

        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException(
                    "Password must be at least 8 characters"
            );
        }

        if (appUserRepository.findByUsername(cleanUsername).isPresent()) {
            throw new IllegalArgumentException("Username already exists");
        }

        AppUser appUser = new AppUser(
                cleanUsername,
                passwordEncoder.encode(password)
        );

        return appUserRepository.save(appUser);
    }
}
