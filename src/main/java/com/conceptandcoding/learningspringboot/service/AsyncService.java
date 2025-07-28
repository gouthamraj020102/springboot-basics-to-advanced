package com.conceptandcoding.learningspringboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncService {

    @Async("myThreadPoolExecutor")
    public void asyncMethodTest() {
        System.out.println("inside asyncMethodTest: " + Thread.currentThread().getName());
        try {
            Thread.sleep(50000);
        } catch (Exception e) {

        }
    }
}
