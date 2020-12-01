package com.thread.pool;

public class ThreadGroupExample implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main (String args[]) {
		ThreadGroupExample threadGroupExample = new ThreadGroupExample();
		ThreadGroup threadGroup = new ThreadGroup("Parent Thread Group");
		
		Thread thread1 = new Thread(threadGroup,threadGroupExample,"one");
		thread1.start();
		
		Thread thread2 = new Thread(threadGroup,threadGroupExample,"two");
		thread2.start();
		
		Thread thread3 = new Thread(threadGroup,threadGroupExample,"three");
		thread3.start();
		
		System.out.println("Thread Group Name :" +threadGroup.getName());
		threadGroup.list();
	}
}
