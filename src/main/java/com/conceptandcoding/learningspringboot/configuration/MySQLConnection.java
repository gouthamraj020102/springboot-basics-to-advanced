package com.conceptandcoding.learningspringboot.configuration;

import org.springframework.stereotype.Component;

@Component
public class MySQLConnection {

    MySQLConnection() {
        System.out.println("initialization of MySQLConnection Bean");
    }
}
