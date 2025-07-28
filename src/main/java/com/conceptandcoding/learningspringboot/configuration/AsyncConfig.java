package com.conceptandcoding.learningspringboot.configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;

@Configuration
public class AsyncConfig implements AsyncConfigurer {

    private ThreadPoolExecutor poolExecutor;

    @Override
    public synchronized Executor getAsyncExecutor() {
        if(poolExecutor == null) {
            int minPoolSize = 2;
            int maxPoolSize = 4;
            int queueSize = 3;
            poolExecutor = new ThreadPoolExecutor(minPoolSize, maxPoolSize, 1,
                        TimeUnit.HOURS, new ArrayBlockingQueue<>(queueSize), new CustomThreadFactory());
        }
        return poolExecutor;
    }
}

class CustomThreadFactory implements ThreadFactory {

    private final AtomicInteger threadNo = new AtomicInteger(1);
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("MyThread-" + threadNo.getAndIncrement());
        return thread;
    }
}