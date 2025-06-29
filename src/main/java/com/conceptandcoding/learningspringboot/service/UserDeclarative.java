package com.conceptandcoding.learningspringboot.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserDeclarative {

    @Transactional(transactionManager = "userTransactionManager")
    public void updateUserProgrammatic() {
        // Some DB Operations
        System.out.println("Insert Query ran");
        System.out.println("Update Query ran");
    }
}
