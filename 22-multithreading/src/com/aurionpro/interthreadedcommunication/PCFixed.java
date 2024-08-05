package com.aurionpro.interthreadedcommunication;

class PCFixed {
    public static void main(String args[]) {
        Queue q = new Queue(); // Create a shared queue.
        new Producer(q); // Create and start a producer thread.
        new Consumer(q); // Create and start a consumer thread.
        System.out.println("Press Control-C to stop."); // Print a message.
    }
}
