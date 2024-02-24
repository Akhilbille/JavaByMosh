package com.javapractise;

class MyData{
	public void display(String str) {
		
		for(int i = 0 ;i <str.length();i++) {
			System.out.print(str.charAt(i));
			try{Thread.sleep(100);}catch(Exception e){}
		}
	}
}

class Thread1 extends Thread{
	MyData d;
	public Thread1(MyData d) {
		this.d =d;		
	}
	
	public void run() {
		d.display("Hello World");
	}
}

class Thread2 extends Thread{
	MyData d;
	public Thread2 (MyData d) {
		this.d = d;
	}
	
	public void run() {
		d.display("Welcome");
	}
	
}

public class J91SynchroniseThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyData d = new MyData();
		Thread1 t = new Thread1(d);
		Thread2 t1 = new Thread2(d);
		t.start();
		t1.start();

	}

}
