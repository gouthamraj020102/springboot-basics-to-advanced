package com.conceptandcoding.learningspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conceptandcoding.learningspringboot.repository.IEmployee;
import com.conceptandcoding.learningspringboot.service.EmployeeDAO;
import com.conceptandcoding.learningspringboot.service.EmployeeUtil;

@RestController
@RequestMapping(value = "/api/")
public class Employee {

    @Autowired
    EmployeeUtil employeeUtil;

    @Autowired
    @Qualifier("tempEmployee")
    IEmployee employeeObj;

    @GetMapping(path = "/fetchEmployee")
    public String fetchEmployee() {
        employeeUtil.employeeHelperMethod();
        employeeUtil.employeeHelperMethod("xyz", 123);
        employeeUtil.employeeHelperMethod(new EmployeeDAO());
        employeeObj.fetchEmployeeMethod();
        return "item fetched";
    }
    
}
