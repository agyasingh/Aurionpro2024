package com.aurionpro.interthreadedcommunication;

class Queue {
    int n; // The data item.
    boolean valueSet = false; // A flag to check if the data is ready to be consumed.
    //Consumer consumes data
    synchronized int get() {
        while (!valueSet) // While there's no data to consume,
            try {
                wait(); // Wait until the producer produces data.
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        System.out.println("Got: " + n); // Consume the data.
        valueSet = false; // Mark the data as consumed.
        notify(); // Notify the producer that it can produce more data.
        return n; // Return the consumed data.
    }
    //Prdoucer produces data
    synchronized void put(int n) {
        while (valueSet) // While the consumer hasn't consumed the data,
            try {
                wait(); // Wait until the consumer consumes the data.
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        this.n = n; // Produce the data.
        valueSet = true; // Mark the data as ready to be consumed.
        System.out.println("Put: " + n); // Print the produced data.
        notify(); // Notify the consumer that data is ready to be consumed.
    }
}
