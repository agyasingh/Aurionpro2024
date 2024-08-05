package com.aurionpro.interthreadedcommunication;

class Consumer implements Runnable {
    Queue q;
    
    Consumer(Queue q) {
        this.q = q; // Link to the shared queue.
        new Thread(this, "Consumer").start(); // Start the consumer thread.
    }
    
    public void run() {
        while (true) {
            q.get(); // Continuously consume data.
        }
    }
}
