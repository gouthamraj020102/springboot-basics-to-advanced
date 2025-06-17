package com.conceptandcoding.learningspringboot.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class User {

    @Autowired
    OrderInterface orderInterface;

    @PostMapping("/createOrder")
    public ResponseEntity<String> createOrder() {
        orderInterface.createOrder();
        return ResponseEntity.ok("");
    }
}
