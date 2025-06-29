package com.conceptandcoding.learningspringboot.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;

@Component
public class UserProgrammaticApproach1 {

    PlatformTransactionManager userTransactionManager;

    public UserProgrammaticApproach1(PlatformTransactionManager userTransactionManager) {
        this.userTransactionManager = userTransactionManager;
    }

    public void updateUserProgrammatic() {
        TransactionStatus status = userTransactionManager.getTransaction(null);
        try {
            // Some Initial set of DB operations
            System.out.println("Insert Query run1");
            System.out.println("Update Query run1");
            userTransactionManager.commit(status);
        } catch (Exception e) {
            userTransactionManager.rollback(status);
        }
    }
}
