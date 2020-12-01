package com.thread.java;

public class ThreadExample2 extends Thread{

	public void run() {
		System.out.println("Tread started running");
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String args[]) {
		
		ThreadExample2 threadExample2 = new ThreadExample2();
		ThreadExample2 threadExample3 = new ThreadExample2();
		
		System.out.println("Name of threadExample2 is :" +threadExample2.getName());
		System.out.println("Name of threadExample3 is :" +threadExample3.getName());
		
		System.out.println("Id of threadExample3 is :" + threadExample3.getId());
		
		threadExample2.start();
		threadExample3.start();
		
		threadExample2.setName("Devendra");
		System.out.println("After changing the name of thread :" + threadExample2.getName());
	}
}
