package com.conceptandcoding.learningspringboot.dto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("offlineOrderName")
@Component
public class OfflineOrder implements OrderInterface {
    public OfflineOrder() {
        System.out.println("Offline order initialized");
    }

    public void createOrder() {
        System.out.println("created Offline Order");
    }
}
