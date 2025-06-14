package com.conceptandcoding.learningspringboot.dto;

import org.springframework.stereotype.Component;

@Component
public class Invoice {

    // Common issues with Dependency Injection
    // 1. Circular Dependency
    /* @Autowired
    private Order order;

    public Invoice() {
        System.out.println("initializing Invoice");
    } */

    // Solution
    /* @Lazy
    @Autowired
    private Order order;

    public Invoice() {
        System.out.println("initializing Invoice");
    } */

    // Using PostConstruct
    private Order order;

    public Invoice() {
        System.out.println("initializing Invoice");
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
