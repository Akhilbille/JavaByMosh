package com.javapractise;

class MyThread2 extends Thread{
	
	public void run() {
		int count = 0;
		while(true) {
			System.out.println(count++ + "MY Thread ");
		}
	}
	
}

public class J90DaemonJoinThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 mt = new MyThread2();
		mt.setName("Hello");
		mt.start();
//		mt.setDaemon(true);
		Thread currentThread = Thread.currentThread();
//		try {
//			currentThread.join();
//		}
//		catch(InterruptedException e) {
//			System.out.println(e);
//		}
		System.out.println(mt.getName());
		
		int count = 0;
		
		while(true) {
			System.out.println(count++ +"Main");
			Thread.yield();
		}

	}

}
