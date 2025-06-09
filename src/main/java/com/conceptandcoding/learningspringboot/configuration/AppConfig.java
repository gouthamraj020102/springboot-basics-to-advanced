package com.conceptandcoding.learningspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.conceptandcoding.learningspringboot.dto.User;

@Configuration
public class AppConfig {

    @Bean
    public User createUserBean() {
        return new User("defaultusername", "defaultemail");
    }

    @Bean
    public User createAnotherUserBean() {
        return new User("anotherusername", "anotheremail");
    }
}
