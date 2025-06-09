package com.conceptandcoding.learningspringboot.dto;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Book {

    public Book() {
        System.out.println("Lazy: initializing Book");
    }

}
