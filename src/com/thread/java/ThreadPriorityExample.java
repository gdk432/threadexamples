package com.thread.java;

public class ThreadPriorityExample extends Thread{

	public void run() {
		System.out.println("running thread name is :" + Thread.currentThread().getName());
		System.out.println("running thread priority is :" + Thread.currentThread().getPriority());
		
	}
	
	public static void main(String args[]) {
		
		ThreadPriorityExample threadPriorityExample1 = new ThreadPriorityExample();
		ThreadPriorityExample threadPriorityExample2 = new ThreadPriorityExample();
		
		threadPriorityExample1.setPriority(Thread.MIN_PRIORITY);
		threadPriorityExample2.setPriority(Thread.MAX_PRIORITY);
		
		threadPriorityExample1.start();
		threadPriorityExample2.start();
		
	}
}
