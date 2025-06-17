package com.conceptandcoding.learningspringboot.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class User {

    @Qualifier("onlineOrderName")
    @Autowired
    OrderInterface onlineOrderInterface;

    @Qualifier("offlineOrderName")
    @Autowired
    OrderInterface offlineOrderInterface;

    @PostMapping("/createOrder")
    public ResponseEntity<String> createOrder(@RequestParam boolean isOnlineOrder) {
        if(isOnlineOrder) {
            onlineOrderInterface.createOrder();
        } else {
            offlineOrderInterface.createOrder();
        }
        return ResponseEntity.ok("");
    }
}
