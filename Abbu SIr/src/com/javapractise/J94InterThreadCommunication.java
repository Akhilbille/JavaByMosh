package com.javapractise;

class MyDataIC{
	int value = 0;
	
	synchronized public void set(int v) {
		value = v;
	}
	
	synchronized public int get() {
		int x =0;
		x = value;
		return x;
	}
}

class Producer extends Thread{
	MyDataIC data;
	
	public Producer(MyDataIC d) {
		data = d;
	}
	
	 public void run() {
		int i = 1;
		while(true) {
			data.set(i);
			System.out.println("i + : "+ i);
			i++;
//			try {
//				Thread.sleep(1000);
//			} 
//			catch(InterruptedException e) {
//				System.out.println(e);
//			}
		}
	}
}

class Consumer extends Thread{
	MyDataIC data;
	public Consumer(MyDataIC d) {
		data = d;
	}
	synchronized public void run() {
		while(true) {
			System.out.println("Consumer : "+data.get());
//			try {
//				Thread.sleep(1000);
//			}
//			catch(InterruptedException e) {
//				System.out.println(e);
//			}
		}
		
	}
}

public class J94InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDataIC d= new MyDataIC();
		Producer p =new Producer(d);
		Consumer c = new Consumer(d);
		p.start();
		c.start();
		

	}

}
