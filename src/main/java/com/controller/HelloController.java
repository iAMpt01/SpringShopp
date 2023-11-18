package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("message", "Register");
        return "register";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("message", "login");
        return "login";
    }

    @RequestMapping("/")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Dashboard");
        return "dashboard";
    }
}
