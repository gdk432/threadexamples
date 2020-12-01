package com.thread.shutdown;

public class RuntimeTest {

	public static void main(String args[]) throws Exception {
		
		//Runtime.getRuntime().exec("notepad");
		//Runtime.getRuntime().exec("mspaint");
		//Runtime.getRuntime().exec("shutdown -s -t 0");  
		//Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
		//Runtime.getRuntime().exec("shutdown -r -t 0");  
		
		System.out.println(Runtime.getRuntime().availableProcessors());  
	
		 Runtime run=Runtime.getRuntime();  
		  System.out.println("Total Memory: "+run.totalMemory());  
		  System.out.println("Free Memory: "+run.freeMemory());  
		    
		  for(int i=0;i<10000;i++){  
		   new RuntimeTest();  
		  }  
		  System.out.println("After creating 10000 instance, Free Memory: "+run.freeMemory());  
		  System.gc();  
		  System.out.println("After gc(), Free Memory: "+run.freeMemory());
	}
}
