package com.controller.service;

import com.controller.repository.UserRepository;
import com.controller.web.dto.UserRegistrationDto;
import com.controller.model.Role;
import com.controller.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(),
                  registrationDto.getLastName(), registrationDto.getEmail(),
                registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER"))
                );
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
