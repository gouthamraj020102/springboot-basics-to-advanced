package com.conceptandcoding.learningspringboot.dto;

public class OfflineOrder implements OrderInterface {
    public OfflineOrder() {
        System.out.println("Offline order initialized");
    }

    public void createOrder() {
        System.out.println("created Offline Order");
    }
}
