package com.conceptandcoding.learningspringboot.controller;

import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conceptandcoding.learningspringboot.service.AsyncService;

@RestController
@RequestMapping(value = "/api")
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/getUser")
    public String getMethodName() {
        Future<String> result = asyncService.performTaskAsync();
        String output = null;
        try {
            output = result.get();
            System.out.println(output);
        } catch (Exception e) {
            System.out.println("some exception");
        }
        return output;
    }

    @Async
    public void asyncMethodTest() {
        System.out.println("inside asyncMethodTest: " + Thread.currentThread().getName());
    }

}
