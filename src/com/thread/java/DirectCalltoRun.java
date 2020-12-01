package com.thread.java;

public class DirectCalltoRun extends Thread {

	public void run() {
		System.out.println("Thread is started running");
	}
	
	public static void main (String args[]) {
		DirectCalltoRun directCalltoRun = new DirectCalltoRun();
		directCalltoRun.run();
	}
}
