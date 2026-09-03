package com.rookies6.myspringboot4project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserController userController;

    @GetMapping("/thymeleaf")
    public String leaf(Model model) {
        model.addAttribute("name", "스프링부트");
        return "leaf";
    }

    @GetMapping("/index")
    public ModelAndView userlist() {

    }
}