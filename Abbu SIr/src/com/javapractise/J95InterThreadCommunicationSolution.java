package com.javapractise;

class MyDataIC1{
	int value = 0;
	boolean flag = true;
	
	synchronized public void set(int v) {
		
		while(flag!=true) {
			
			try {wait();}catch(InterruptedException e) {}
		}
		value = v;
		flag = false;
		notify();
	}
	
	synchronized public int get() {
		int x =0;
		while(flag!=false) {
			
			try {wait();}catch(InterruptedException e) {}			
		}
		
		x = value;
		
		flag = true;
		notify();
		return x;
	}
}

class Producer1 extends Thread{
	MyDataIC1 data;
	
	public Producer1(MyDataIC1 d) {
		data = d;
	}
	
	 public void run() {
		int i = 1;
		while(true) {
			data.set(i);
			System.out.println("i + : "+ i);
			i++;
			try {
				Thread.sleep(1000);
			} 
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class Consumer1 extends Thread{
	MyDataIC1 data;
	public Consumer1(MyDataIC1 d) {
		data = d;
	}
	 public void run() {
		 int value;
	        while(true)
	        {
	            value=data.get();
	            System.out.println("Consumer "+value);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
}

public class J95InterThreadCommunicationSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDataIC1 d= new MyDataIC1();
		Producer1 p =new Producer1(d);
		Consumer1 c = new Consumer1(d);
		p.start();
		c.start();
		

	}

}
