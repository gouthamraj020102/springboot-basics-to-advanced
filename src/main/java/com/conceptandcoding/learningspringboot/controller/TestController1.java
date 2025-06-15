package com.conceptandcoding.learningspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conceptandcoding.learningspringboot.dto.UserDto;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(value = "/api/")
public class TestController1 {

    @Autowired
    UserDto user;

    public TestController1() {
        System.out.println("TestController1 instance initialization");
    }

    @PostConstruct
    public void init() {
        System.out.println("TestController1 object hashCode: " + this.hashCode() +
                "User DTO object hashCode: " + user.hashCode());
    }

    @GetMapping(path = "/fetchUser1")
    public ResponseEntity<String> getUserDtoDetails() {
        System.out.println("fetchUser1 api invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
    
}
