package com.thread.shutdown;

public class GarbageCollectTest {

	public void finalize() {
		System.out.println("Object garbage is collected");
	}
	
	public static void main (String args[]) {
		GarbageCollectTest garbageCollectTest1 = new GarbageCollectTest();
		GarbageCollectTest garbageCollectTest2 = new GarbageCollectTest();
		
		garbageCollectTest1=null;
		garbageCollectTest2=null;
		
		System.gc();
	}
}
