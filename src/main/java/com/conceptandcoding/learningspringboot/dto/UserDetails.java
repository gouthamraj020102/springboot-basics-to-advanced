package com.conceptandcoding.learningspringboot.dto;

public class UserDetails {

    String username;
    String email;

    public UserDetails(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
