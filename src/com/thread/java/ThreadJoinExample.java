package com.thread.java;

public class ThreadJoinExample extends Thread{

	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			
			System.out.println(i);
		}
	}
	
	public static void main(String args[]) {
		ThreadJoinExample threadJoinExample1 = new ThreadJoinExample();
		ThreadJoinExample threadJoinExample2 = new ThreadJoinExample();
		ThreadJoinExample threadJoinExample3 = new ThreadJoinExample();
		threadJoinExample1.start();
		
		try {
			threadJoinExample1.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		threadJoinExample2.start();
		try {
			threadJoinExample2.join(1500);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		threadJoinExample3.start();
	}
}
