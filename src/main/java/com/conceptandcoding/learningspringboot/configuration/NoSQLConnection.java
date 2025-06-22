package com.conceptandcoding.learningspringboot.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "nosqlconnection", value = "enabled", havingValue = "true", matchIfMissing = false)
public class NoSQLConnection {

    NoSQLConnection() {
        System.out.println("initialization of NoSQLConnection Bean");
    }

}
