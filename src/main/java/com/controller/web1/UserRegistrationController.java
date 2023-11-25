package com.controller.web1;

import com.controller.service.UserService;
import com.controller.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto){
      userService.save(registrationDto);
      return "redirect:/registration?succes";
    }
}
