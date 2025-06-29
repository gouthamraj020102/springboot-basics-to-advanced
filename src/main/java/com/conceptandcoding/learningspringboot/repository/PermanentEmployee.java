package com.conceptandcoding.learningspringboot.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("permaEmployee")
public class PermanentEmployee implements IEmployee {
    @Override
    public void fetchEmployeeMethod() {
        System.out.println("in permanent fetch Employee method");
    }
}
