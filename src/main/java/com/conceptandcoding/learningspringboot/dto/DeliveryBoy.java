package com.conceptandcoding.learningspringboot.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeliveryBoy {

    // Field Injection
    // @Autowired
    // Order order;

    public Invoice invoice;
    public Order order;

    // public DeliveryBoy() {
    //     System.out.println("DeliveryBoy initialized");
    // }

    // Setter Injection
    // @Autowired
    // public void setOrderDependency(Order order) {
    //     this.order = order;
    // }

    // Constructor Injection
    // When only 1 constructor is present, then using @Autowired on the constructor is not mandatory
    // public DeliveryBoy(Order order) {
    //     this.order = order;
    //     System.out.println("DeliveryBoy initialized!");
    // }

    public DeliveryBoy(Order order) {
        this.order = order;
        System.out.println("DeliveryBoy initialized with only Order");
    }

    // When more than 1 constructor is present, then using @Autowired on the constructor is mandatory
    @Autowired
    public DeliveryBoy(Invoice invoice) {
        this.invoice = invoice;
        System.out.println("DeliveryBoy initialized with only invoice");
    }
}
