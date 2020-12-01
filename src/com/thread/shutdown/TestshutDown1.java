package com.thread.shutdown;

public class TestshutDown1 {

	public static void main (String args[]) throws Exception {
		
		Runtime run = Runtime.getRuntime();
		run.addShutdownHook(new ShutdownhookExample());
		
		System.out.println("Now thread is sleeping ... press ctrl+c to exit");
		try {
			Thread.sleep(30000);
		}catch(Exception e) {
			
		}
	}
}
