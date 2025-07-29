package com.conceptandcoding.learningspringboot.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncService {

    @Async
    public CompletableFuture<String> performTaskAsync() {
        return CompletableFuture.completedFuture("async task result");
    }
}
