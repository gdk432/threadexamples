package com.thread.java;

public class ThreadExample1 extends Thread {

	public void run() {
		
		System.out.println("Thread started running");
	}
	
	public static void main (String args[]) {
		ThreadExample1 threadExample1 = new ThreadExample1();
		System.out.println(threadExample1.getState());
		threadExample1.start();
		System.out.println(threadExample1.getState());
	}
}
