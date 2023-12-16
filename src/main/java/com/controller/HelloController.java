package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Dashboard");
        return "dashboard";
    }

    @RequestMapping("/cart")
    public String Cart(Model model) {
        model.addAttribute("message", "Cart");
        return "cart";
    }
}
