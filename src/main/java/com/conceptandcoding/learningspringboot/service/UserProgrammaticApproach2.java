package com.conceptandcoding.learningspringboot.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.transaction.support.TransactionTemplate;

@Component
public class UserProgrammaticApproach2 {

    TransactionTemplate transactionTemplate;

    public UserProgrammaticApproach2(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    /**
     * if(parent txn present)
     * use it
     * else
     * create new
     */
    public void dbOperationWithRequiredPropagationUsingProgrammaticApproach2() {
        TransactionCallback<TransactionStatus> operations = (TransactionStatus status) -> {
            // some operations for this method
            System.out.println("************************");
            System.out.println("Using Programmatic approach 2");
            System.out.println("Propagation.REQUIRED: Is parent transaction active: " + TransactionSynchronizationManager.isActualTransactionActive());
            System.out.println("Propagation.REQUIRED: Current transaction active: " + TransactionSynchronizationManager.getCurrentTransactionName());
            System.out.println("************************");
            return status;
        };
        TransactionStatus status = transactionTemplate.execute(operations);
    }
}
