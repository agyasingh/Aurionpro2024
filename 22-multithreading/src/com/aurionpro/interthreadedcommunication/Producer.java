package com.aurionpro.interthreadedcommunication;

class Producer implements Runnable {
    Queue q;
    
    Producer(Queue q) {
        this.q = q; // Link to the shared queue.
        new Thread(this, "Producer").start(); // Start the producer thread.
    }
    
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++); // Continuously produce data.
        }
    }
}
