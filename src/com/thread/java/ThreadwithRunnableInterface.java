package com.thread.java;

public class ThreadwithRunnableInterface implements Runnable {

	
	public void run() {
		System.out.println("Therad is started running");
		
	}
	
	public static void main (String args[]) {
		ThreadwithRunnableInterface threadwithRunnableInterface = new ThreadwithRunnableInterface();
		Thread thread = new Thread(threadwithRunnableInterface);
		thread.start();
	}

	
}
