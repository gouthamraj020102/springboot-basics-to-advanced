package com.conceptandcoding.learningspringboot.configuration;

import org.springframework.stereotype.Component;

@Component
public class NoSQLConnection {

    NoSQLConnection() {
        System.out.println("initialization of NoSQLConnection Bean");
    }

}
