package com.javapractise;

public class J87InterfaceRunnable implements Runnable  {
	
	public void run() {
		int i = 1;
		while(true) {
			System.out.println(i+"------");
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J87InterfaceRunnable ir = new J87InterfaceRunnable();
		Thread t = new Thread(ir);
		t.start();
		int i =1;
		while(true) {
			System.out.println(i+"||||||||||");
			i++;
		}
		
		
				

	}

}
