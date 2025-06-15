package com.conceptandcoding.learningspringboot.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Scope("prototype")
public class UserDto {

    public UserDto() {
        System.out.println("User DTO initialization");
    }

    @PostConstruct
    public void init() {
        System.out.println("User DTO object hashCode: " + this.hashCode());
    }
}
