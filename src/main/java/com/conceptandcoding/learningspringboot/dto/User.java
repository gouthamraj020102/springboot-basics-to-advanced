package com.conceptandcoding.learningspringboot.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {


    // Default Constructor
    /* public User() {
        System.out.println("initializing User");
    } */


    // Field Injection
    /* @Autowired
    private Order order; */


    // Setter Injection
    /* private Order order;

    @Autowired
    public void setOrderDependency(Order order) {
        this.order = order;
    } */


    // Constructor Injection
    /* private Order order;
    private Invoice invoice;

    public User(Order order) {
        this.order = order;
        System.out.println("User initialized");
    }

    @Autowired
    public User(Invoice invoice) {
        this.invoice = invoice;
        System.out.println("Invoice initialized");
    } */


    // Immutable object using Constructor Injection
    /* private final Order order;

    public User(Order order) {
        this.order = order;
        System.out.println("Order initialized");
    } */


    // Fail Fast
    /* private Order order;

    public User() {
        System.out.println("initializing User");
    }

    @PostConstruct
    public void init() {
        System.out.println(order == null);
    } */


    /* private Order order;

    public User(Order order) {
        this.order = order;
        System.out.println("Order initialized");
    }

    @PostConstruct
    public void init() {
        System.out.println(order == null);
    } */


    // public void process() {
    //     System.out.println("initializing order process");
    //     order.process();
    // }


    // Common issues with Dependency Injection
    // 2. Unsatisfied Dependency
        //  i) Using Primary in any of the concrete class

    /* @Autowired
    OrderInterface orderInterface;

    public User() {
        System.out.println("initializing User");
    } */

//  ii) Using Qualifier to define the bean name explicitly
    @Qualifier("offlineOrderName")
    @Autowired
    OrderInterface orderInterface;

    public User() {
        System.out.println("initializing User");
    }
}
