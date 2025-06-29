package com.conceptandcoding.learningspringboot.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserService {

    @Transactional
    public void updateUser() {
        System.out.println("UPDATE QUERY TO update the user db values");
        // throw new RuntimeException();
    }
}
