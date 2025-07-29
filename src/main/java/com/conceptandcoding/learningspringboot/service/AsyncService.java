package com.conceptandcoding.learningspringboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncService {

    @Async
    public void performTaskAsync() {
        try {
            // perform some task
        } catch (Exception e) {
            // handle the exception here
        }
    }
}
