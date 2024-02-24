package com.javapractise;

class ATM{
	
	synchronized public void checkBalance(String name) {
		System.out.println("Hi "+ name + " is Cheking Balance");
		try 
		{Thread.sleep(1000);}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	synchronized public void withDrawBalance(String name,int amount ) {
		System.out.println("Hi "+ name + " you are with drawing "+ amount);
		try 
		{Thread.sleep(1000);}
		catch(Exception e) {
			System.out.println(e); 
		}
	}
	
}

class CustomerATM extends Thread{
	ATM a;
	String name;
	int amount;
	public CustomerATM(ATM a,String name,int amount) {
		this.a = a;
		this.name = name;
		this.amount= amount;
				
		
	}
	
	public void useATM() {
		a.checkBalance(this.name);
		a.withDrawBalance(this.name,this.amount);
	}
	public void run() {
		useATM();
	}
	
}

public class J93ATMChanllenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM a = new ATM();
		CustomerATM c = new CustomerATM(a, "Akhil", 1000);
		CustomerATM c1 = new CustomerATM(a, "Deepu", 1500);
		c.start();
		c1.start();

	}

}
