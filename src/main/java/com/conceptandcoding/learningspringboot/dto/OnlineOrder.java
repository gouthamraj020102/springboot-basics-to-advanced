package com.conceptandcoding.learningspringboot.dto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("onlineOrderName")
@Component
public class OnlineOrder implements OrderInterface {

    public OnlineOrder() {
        System.out.println("Online order initialized");
    }

    public void createOrder() {
        System.out.println("created Online Order");
    }
}
