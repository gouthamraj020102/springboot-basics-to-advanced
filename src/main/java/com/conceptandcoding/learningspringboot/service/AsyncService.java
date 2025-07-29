package com.conceptandcoding.learningspringboot.service;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

@Component
public class AsyncService {

    @Async
    public Future<String> performTaskAsync() {
        return new AsyncResult<>("async task result");
    }
}
