package com.thread.java;

public class ThreadSleepExample extends Thread {

	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			
			System.out.println(i);
		}
	}
	
	public static void main (String args[]) {
		ThreadSleepExample threadSleepExample1 = new ThreadSleepExample();
		ThreadSleepExample threadSleepExample2 = new ThreadSleepExample();
		threadSleepExample1.start();
		threadSleepExample2.start();
	}
}
