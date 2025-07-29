package com.conceptandcoding.learningspringboot.controller;

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
        System.out.println("Inside getUser method: " + Thread.currentThread().getName());
        asyncMethodTest();
        return null;
    }

    @Async
    public void asyncMethodTest() {
        System.out.println("inside asyncMethodTest: " + Thread.currentThread().getName());
    }

}
