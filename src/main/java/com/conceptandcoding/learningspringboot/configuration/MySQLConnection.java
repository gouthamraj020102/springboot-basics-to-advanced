package com.conceptandcoding.learningspringboot.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "sqlconnection", value = "enabled", havingValue = "true", matchIfMissing = false)
public class MySQLConnection {

    MySQLConnection() {
        System.out.println("initialization of MySQLConnection Bean");
    }
}
