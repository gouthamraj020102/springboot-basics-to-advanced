package com.conceptandcoding.learningspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conceptandcoding.learningspringboot.service.UserProgrammaticApproach2;

@RestController
@RequestMapping(value = "/api/")
public class UserController {

    @Autowired
    UserProgrammaticApproach2 user;

    @PostMapping(path = "/updateuser")
    public String updateUser() {
        user.updateUserProgrammatic();
        return "user is updated successfully";
    }
    
}
