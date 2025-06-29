package com.conceptandcoding.learningspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conceptandcoding.learningspringboot.service.UserService;

@RestController
@RequestMapping(value = "/api/")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(path = "/updateuser")
    public String updateUser() {
        userService.updateUser();
        return "user is updated successfully";
    }
    
}
