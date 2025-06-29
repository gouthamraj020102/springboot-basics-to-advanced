package com.conceptandcoding.learningspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
public class UserDeclarative {

    @Autowired
    UserProgrammaticApproach1 userProgrammaticApproach1;
    @Autowired
    UserProgrammaticApproach2 userProgrammaticApproach2;

    @Transactional
    public void updateUser() {
        System.out.println("Is transaction active: " + TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("Current transaction active: " + TransactionSynchronizationManager.getCurrentTransactionName());
        System.out.println("Some initial DB operation");
        userProgrammaticApproach1.dbOperationWithRequiredPropagationUsingProgrammaticApproach1();
        userProgrammaticApproach2.dbOperationWithRequiredPropagationUsingProgrammaticApproach2();
        System.out.println("Some final DB operation");
    }

    @Transactional(transactionManager = "userTransactionManager")
    public void updateUserProgrammatic() {
        // Some DB Operations
        System.out.println("Insert Query ran");
        System.out.println("Update Query ran");
    }
}
