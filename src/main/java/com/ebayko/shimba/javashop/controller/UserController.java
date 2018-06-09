package com.ebayko.shimba.javashop.controller;

import com.ebayko.shimba.javashop.domain.User;
import com.ebayko.shimba.javashop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path = "/joinform")
    public String joinForm() {
        return "users/joinForm";
    }

    @PostMapping
    public String join(@ModelAttribute User user) {
        user.setRegDate(LocalDateTime.now());

        user = userService.addUser(user);

        return "redirect:/users/welcome";
    }

    @GetMapping(path = "/welcome")
    public String welcome() {
        return "users/welcome";
    }
}
