package com.conceptandcoding.learningspringboot.repository;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
public class UserDAO {

    private final String SEPARATOR = "************************";

    // Propagation.REQUIRED: Uses the existing transaction if parent is active; otherwise, starts a new transaction.
    // This is the default propagation behavior in Spring.
    @Transactional(propagation = Propagation.REQUIRED)
    public void method2() {

        // Execute DB queries
        boolean isTransactionActive = TransactionSynchronizationManager.isActualTransactionActive();
        String currentTransactionName = TransactionSynchronizationManager.getCurrentTransactionName();
        System.out.println(SEPARATOR);
        System.out.println("Propagation.REQUIRED: Is parent transaction active: " + isTransactionActive);
        System.out.println("Propagation.REQUIRED: Current transaction active: " + currentTransactionName);
        System.out.println(SEPARATOR);
    }

    // Propagation.REQUIRES_NEW: Always starts a new transaction, suspending any existing parent one.
    // Once the new transaction completes, the previous transaction (if any) is resumed.
    // If no existing transaction is present, it simply starts a new one.
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void method3() {
        // Execute DB queries
        boolean isTransactionActive = TransactionSynchronizationManager.isActualTransactionActive();
        String currentTransactionName = TransactionSynchronizationManager.getCurrentTransactionName();
        System.out.println(SEPARATOR);
        System.out.println("Propagation.REQUIRES_NEW: Is parent transaction active: " + isTransactionActive);
        System.out.println("Propagation.REQUIRES_NEW: Current transaction active: " + currentTransactionName);
        System.out.println(SEPARATOR);
    }

    // Propagation.SUPPORTS: Executes within the current transaction if parent exists; otherwise, runs non-transactionally. No new transaction is started
    @Transactional(propagation = Propagation.SUPPORTS)
    public void method4() {
        // Execute DB queries
        boolean isTransactionActive = TransactionSynchronizationManager.isActualTransactionActive();
        String currentTransactionName = TransactionSynchronizationManager.getCurrentTransactionName();
        System.out.println(SEPARATOR);
        System.out.println("Propagation.SUPPORTS: Is parent transaction active: " + isTransactionActive);
        System.out.println("Propagation.SUPPORTS: Current transaction active: " + currentTransactionName);
        System.out.println(SEPARATOR);
    }

    // Propagation.NOT_SUPPORTED: Suspends any existing transaction and executes the method non-transactionally. Once the method completes, the suspended transaction (if any) is resumed.
    // If no transaction exists, the method simply runs without a transactional context.
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void method5() {
        // Execute DB queries
        boolean isTransactionActive = TransactionSynchronizationManager.isActualTransactionActive();
        String currentTransactionName = TransactionSynchronizationManager.getCurrentTransactionName();
        System.out.println(SEPARATOR);
        System.out.println("Propagation.NOT_SUPPORTED: Is parent transaction active: " + isTransactionActive);
        System.out.println("Propagation.NOT_SUPPORTED: Current transaction active: " + currentTransactionName);
        System.out.println(SEPARATOR);
    }

    // Propagation.MANDATORY: Requires an existing transaction to execute. If no active transaction exists, an exception is thrown.
    // This ensures the method is always executed within a transactional context.
    @Transactional(propagation = Propagation.MANDATORY)
    public void method6() {
        // Execute DB queries
        boolean isTransactionActive = TransactionSynchronizationManager.isActualTransactionActive();
        String currentTransactionName = TransactionSynchronizationManager.getCurrentTransactionName();
        System.out.println(SEPARATOR);
        System.out.println("Propagation.MANDATORY: Is parent transaction active: " + isTransactionActive);
        System.out.println("Propagation.MANDATORY: Current transaction active: " + currentTransactionName);
        System.out.println(SEPARATOR);
    }

    // Propagation.NEVER: Executes the method only if no active transaction exists. If a transaction is currently active, an exception is thrown.
    // This ensures the method always runs outside of a transactional context.
    @Transactional(propagation = Propagation.NEVER)
    public void method7() {
        // Execute DB queries
        boolean isTransactionActive = TransactionSynchronizationManager.isActualTransactionActive();
        String currentTransactionName = TransactionSynchronizationManager.getCurrentTransactionName();
        System.out.println(SEPARATOR);
        System.out.println("Propagation.NEVER: Is parent transaction active: " + isTransactionActive);
        System.out.println("Propagation.NEVER: Current transaction active: " + currentTransactionName);
        System.out.println(SEPARATOR);
    }
}
