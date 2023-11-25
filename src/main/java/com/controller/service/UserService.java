package com.controller.service;

import com.controller.web.dto.UserRegistrationDto;
import com.controller.model.User;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
