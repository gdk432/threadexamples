package com.thread.java;

public class StartTwiceExample extends Thread{

	public void run() {
		System.out.println("Thread is started running");
	}
	
	public static void main (String args[]) {
		StartTwiceExample startTwiceExample = new StartTwiceExample();
		startTwiceExample.start();
		startTwiceExample.start();
	}
}
