package com.thread.java;

public class DirectCalltoRun2 extends Thread {

	public void run() {
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
		
	}
	
	public static void main (String args[]) {
		DirectCalltoRun2 directCalltoRun1 = new DirectCalltoRun2();
		DirectCalltoRun2 directCalltoRun2 = new DirectCalltoRun2();
		directCalltoRun1.run();
		directCalltoRun1.run();
	}
}
