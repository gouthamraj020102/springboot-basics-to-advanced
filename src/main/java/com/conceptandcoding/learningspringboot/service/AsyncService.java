package com.conceptandcoding.learningspringboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncService {

    @Async
    public void performTaskAsync() {
        int i = 0;
        System.out.println(5/i);
    }
}
