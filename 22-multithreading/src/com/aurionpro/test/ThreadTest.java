package com.aurionpro.test;

public class ThreadTest {
	//main thread creation-everything in java is a thread. 
	public static void main(String[] args) {
		
		Thread thread=Thread.currentThread();
		System.out.println(thread);
		thread.setName("My thread");
		System.out.println(thread);
		
		for(int i=0;i<5;i++) {
			System.out.println(thread.currentThread().getName()+ ":" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//CPU should not be idle.
	//All threads are spawned from main thread.
    //main should be the last thread to be finished.
	//Its default priority is 5.
	//thread group is thread.
}
