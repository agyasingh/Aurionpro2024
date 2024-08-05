package com.aurionpro.test;

import com.aurionpro.thread.RunnableThread;

public class RunnableThreadDemo {
public static void main(String[] args) {
	RunnableThread thread1=new RunnableThread("thread1");
	//thread1.start() will not work because it is a part of thread class.
	
//	Thread thread1=new Thread(new RunnableThread("thread1"));
	
	try {
		thread1.getThread().join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
