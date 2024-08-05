package com.aurionpro.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.aurionpro.model.Task;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        //to check how many processors are present in my cpu.
        int coreCount = Runtime.getRuntime().availableProcessors();
        
        System.out.println("Available processors: " + coreCount);
        
        //ExecutorService service = Executors.newFixedThreadPool(coreCount);
        
        // Creates threads on demand
         ExecutorService service = Executors.newCachedThreadPool();
        
       // ExecutorService service=Executors.newSingleThreadExecutor();
        
        for (int i = 0; i < 1000; i++) {
            service.execute(new Task());
        }
    }
}


