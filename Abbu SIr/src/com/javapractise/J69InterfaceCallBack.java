package com.javapractise;

interface Member{
	void callBack();
}

class Customers implements Member{
	
	String name;
	Customers(String name){
		this.name = name;
		
	}
	
	public void callBack() {
		System.out.println("Ok, i will visit " + name);
	}	
}

class Store{
	Member mem[] = 	new Member[100];
	int count = 0;
	
	void register(Member m) {
		mem[count++] =m;
	}
	
	void inviteSale() {
		for(int i=0; i < count;i++) {
			mem[i].callBack();
		}
	}
}

public class J69InterfaceCallBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store s = new Store();
		Customers c1 = new Customers("John");
		Customers c2 = new Customers("Smith");
		s.register(c1);
		s.register(c2);
		s.inviteSale();
	}

}
