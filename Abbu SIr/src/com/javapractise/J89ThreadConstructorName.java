package com.javapractise;

class MyThread1 extends Thread{
	
	public MyThread1(String name) {
		super(name);
	}
	
	public void run() {
		int count = 0;
		while(true) {
			System.out.println(count);
			count++;
			try {
				
				Thread.sleep(1000);
			}
			catch(InterruptedException e ) {
				System.out.println(e);
			}
		}
		
		
	}
	
	
	
}

public class J89ThreadConstructorName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 mt = new MyThread1("Name");
		System.out.println(mt.getId());
		System.out.println(mt.getName());
		System.out.println(mt.getPriority());
		
		System.out.println(mt.getState());
		System.out.println(mt.isAlive());
		mt.start();
		mt.interrupt();
		System.out.println(mt.getState());
		System.out.println(mt.isAlive());
		

	}

}
