package com.conceptandcoding.learningspringboot.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeUtil {

    public void employeeHelperMethod() {
        System.out.println("employee helper method called");
    }

    public void employeeHelperMethod(String str, int val) {
        System.out.println("employee helper method with arguments is called");
    }

    public void employeeHelperMethod(EmployeeDAO employeeDAO) {
        System.out.println("employee helper method with arguments of type Object is called");
    }
}
