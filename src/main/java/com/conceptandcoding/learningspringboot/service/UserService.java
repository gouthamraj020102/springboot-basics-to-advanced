package com.conceptandcoding.learningspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.conceptandcoding.learningspringboot.repository.UserDAO;

@Component
public class UserService {

    @Autowired
    UserDAO userDAOobj;

    @Transactional
    public void method1() {
        System.out.println("Is transaction active: " + TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("Current transaction active: " + TransactionSynchronizationManager.getCurrentTransactionName());
        System.out.println("Some initial DB operation");
        userDAOobj.method2(); // Propagation.REQUIRED
        userDAOobj.method3(); // Propagation.REQUIRES_NEW
        userDAOobj.method4(); // Propagation.SUPPORTS
        userDAOobj.method5(); // Propagation.NOT_SUPPORTED
        userDAOobj.method6(); // Propagation.MANDATORY
        // userDAOobj.method7(); // Propagation.NEVER
        System.out.println("Some final DB operation");
    }

    @Transactional
    public void updateUser() {
        System.out.println("UPDATE QUERY TO update the user db values");
        // throw new RuntimeException();
    }
}
