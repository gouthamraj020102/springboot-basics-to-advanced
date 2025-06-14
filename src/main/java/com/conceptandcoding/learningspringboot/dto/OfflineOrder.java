package com.conceptandcoding.learningspringboot.dto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//  ii) Using Qualifier to define the bean name explicitly
@Qualifier("offlineOrderName")
@Component
public class OfflineOrder implements OrderInterface {
    public OfflineOrder() {
        System.out.println("Offline order initialized");
    }
}
