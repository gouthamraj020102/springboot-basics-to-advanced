package com.conceptandcoding.learningspringboot.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Order {

    // Default Constructor
    /* public Order() {
        System.out.println("initializing Order");
    }

    public void process() {
        System.out.println("Process initialized");
    } */


    // Common issues with Dependency Injection
    // 1. Circular Dependency


    // @Autowired
    // Invoice invoice;


    // Default Constructor
    /* public Order() {
        System.out.println("initializing Order");
    }

    @Autowired
    Invoice invoice; */


    // Solution
    // Using PostConstruct
    @Autowired
    Invoice invoice;

    public Order() {
        System.out.println("initializing Order");
    }

    @PostConstruct
    public void initialize() {
        invoice.setOrder(this);
        System.out.println("initialized Order through PostConstruct");
    }

}
