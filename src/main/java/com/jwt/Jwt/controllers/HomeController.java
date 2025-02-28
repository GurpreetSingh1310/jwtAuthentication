package com.jwt.Jwt.controllers;

import com.jwt.Jwt.UserService;
import com.jwt.Jwt.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getUser() {
        System.out.println("User aa gye oye");
        return userService.getStore();
    }

    @GetMapping("/current-user")
    public String getLoggedinUser(Principal principal) {
        return principal.getName(); // It'll give the data of the logged-in user

    }

}
