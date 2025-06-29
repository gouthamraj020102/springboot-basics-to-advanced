package com.conceptandcoding.learningspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conceptandcoding.learningspringboot.service.UserDeclarative;
import com.conceptandcoding.learningspringboot.service.UserService;

@RestController
@RequestMapping(value = "/api/")
public class UserController {

    @Autowired
    UserService userServiceObj;
    @Autowired
    UserDeclarative userDeclarative;

    @PostMapping(path = "/updateuser")
    public String updateUser() {
        userDeclarative.updateUser();
        return "user is updated successfully";
    }
    
}
