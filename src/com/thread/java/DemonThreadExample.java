package com.thread.java;

public class DemonThreadExample extends Thread {

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("demaon thread is working good");
		}
		else {
			System.out.println("user thread is working good");
		}
	}
	
	public static void main(String args[]) {
	
		DemonThreadExample demonThreadExample1 = new DemonThreadExample();
		DemonThreadExample demonThreadExample2 = new DemonThreadExample();
		DemonThreadExample demonThreadExample3 = new DemonThreadExample();
		
		demonThreadExample1.setDaemon(true);
		
		demonThreadExample1.start();
		demonThreadExample2.start();
		demonThreadExample3.start();
	}
}
