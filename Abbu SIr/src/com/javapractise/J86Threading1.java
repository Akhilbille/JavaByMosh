package com.javapractise;

public class J86Threading1 extends Thread {
	
	public void run() {
		int i =1;
		while(true) {
			System.out.println(i+"Hello");
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J86Threading1 t = new J86Threading1();
		t.start();
		int i =1;
		while(true) {
			System.out.println(i+"World");
			i++;
		}
				

	}

}
