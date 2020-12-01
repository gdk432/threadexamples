package com.thread.shutdown;

public class ShutdownHookAnnonoms {

	public static void main (String args[]) throws Exception {
		
		Runtime run = Runtime.getRuntime();
		run.addShutdownHook(new Thread() {
			public void run() {
				System.out.println("shut-down hook task completed");
			}
		});
		
		System.out.println("Now main is sleeping press ctrl+c to exit");
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			
		}
	}
}
