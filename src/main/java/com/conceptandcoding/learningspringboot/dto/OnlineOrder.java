package com.conceptandcoding.learningspringboot.dto;

public class OnlineOrder implements OrderInterface {

    public OnlineOrder() {
        System.out.println("Online order initialized");
    }

    public void createOrder() {
        System.out.println("created Online Order");
    }
}
