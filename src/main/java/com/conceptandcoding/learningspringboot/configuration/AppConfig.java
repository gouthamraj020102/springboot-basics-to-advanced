package com.conceptandcoding.learningspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.conceptandcoding.learningspringboot.dto.UserDetails;

@Configuration
public class AppConfig {

    @Bean
    public UserDetails createUserBean() {
        return new UserDetails("defaultusername", "defaultemail");
    }

    @Bean
    public UserDetails createAnotherUserBean() {
        return new UserDetails("anotherusername", "anotheremail");
    }
}
