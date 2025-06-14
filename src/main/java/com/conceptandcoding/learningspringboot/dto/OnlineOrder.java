package com.conceptandcoding.learningspringboot.dto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//  i) Using Primary in any of the concrete class
// @Primary

//  ii) Using Qualifier to define the bean name explicitly
@Qualifier("onlineOrderName")
@Component
public class OnlineOrder implements OrderInterface {
    public OnlineOrder() {
        System.out.println("Online order initialized");
    }
}
