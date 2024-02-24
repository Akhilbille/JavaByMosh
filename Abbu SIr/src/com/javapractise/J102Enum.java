package com.javapractise;

enum Dept{
	CS("AB","A block"),IT("BC", "B block"),ECE("DE","C block"),MECH("EF","D Block");
	
	String head;
	String location;
	
	private Dept(String head,String loc) {
		this.head = head;
		this.location = loc;
	}
	
	public void display() {
		System.out.println(this.head);
		System.out.println(this.location);
	}
	
	
}



public class J102Enum {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dept d = Dept.CS;
		d.display();
		

	}

}
