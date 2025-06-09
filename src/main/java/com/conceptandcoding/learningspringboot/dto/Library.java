package com.conceptandcoding.learningspringboot.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Library {

    @Autowired
    Book book;

    @PostConstruct
    public void initialize() {
        System.out.println("Bean has been constructed and dependencies have been injected");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Bean is about to destroy, in PreDestroy method");
    }

    public Library() {
        System.out.println("Initializing Library");
    }

}
