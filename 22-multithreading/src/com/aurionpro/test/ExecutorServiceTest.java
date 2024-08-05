package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.aurionpro.model.NewTask;

public class ExecutorServiceTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        
        // Submitting a single task and capturing its Future
        Future<Integer> future = service.submit(new NewTask());
        
        // Creating a list of tasks
        List<NewTask> tasks = new ArrayList<>();
        
        // Adding tasks to the list (assuming newTask() method returns NewTask)
        tasks.add(newTask());
        tasks.add(newTask());
        tasks.add(newTask());
        tasks.add(newTask());
        tasks.add(newTask());
        
        try {
            // Uncomment to print the result of a single Future
            // System.out.println(future.get());
            
            // Example of using invokeAll to execute multiple tasks and get their results
            List<Future<Integer>> futures = service.invokeAll(tasks);
            
            // Iterating through the futures and printing results
            for (Future<Integer> newFuture : futures) {
                System.out.println(newFuture.get());
            }
            
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        
        // Shutdown the ExecutorService
        service.shutdown();
    }

    private static NewTask newTask() {
        // Implement this method to create and return a NewTask instance
        return new NewTask();  // Example assuming NewTask has a default constructor
    }
}

