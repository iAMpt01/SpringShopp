package com.controller.service;

import com.controller.web.dto.UserRegistrationDto;
import model.User;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
