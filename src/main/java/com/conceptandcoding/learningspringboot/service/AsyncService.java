package com.conceptandcoding.learningspringboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncService {

    @Async
    public void asyncMethod() {
        System.out.println("inside asyncMethod: " + Thread.currentThread().getName());
    }
}
