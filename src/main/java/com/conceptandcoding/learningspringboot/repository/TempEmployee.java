package com.conceptandcoding.learningspringboot.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("tempEmployee")
public class TempEmployee implements IEmployee {
    @Override
    public void fetchEmployeeMethod() {
        System.out.println("in temp Employee fetch method");
    }
}
