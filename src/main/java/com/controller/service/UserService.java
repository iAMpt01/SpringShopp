package com.controller.service;

import com.controller.web.dto.UserRegistrationDto;
import com.controller.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
