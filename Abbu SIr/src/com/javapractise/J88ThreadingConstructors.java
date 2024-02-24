package com.javapractise;


class MyThread implements Runnable{
	public void run() {
		
	}
}

public class J88ThreadingConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		MyThread my = new MyThread();
		Thread t  = new Thread(new MyThread(),"My name");

	}

}
