package com.javapractise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class AccountClass implements Serializable{
	
	
	String accountNumber;
	String name;
	double balance;
	
	public AccountClass(){}
	
	public AccountClass(String ac,String name,double bal) {
		this.accountNumber = ac;
		this.name = name;
		this.balance = bal;
	}
	
	public String toString() {
		return "Account Number : "+this.accountNumber+
				"\nName : " + this.name+
				"\nBalance : "+ this.balance;
	}
	
	
	
}


public class J130StudentChallengeCollections implements Serializable {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int choice;
		String ac;
		AccountClass ac1;
		Scanner sc = new Scanner(System.in);
		HashMap<String, AccountClass> hm = new HashMap<String, AccountClass>();
		
		try {
			FileInputStream fis = new FileInputStream("E:/Practise/StudentChallenge1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println("Hello IN");
			int s = ois.read();
			System.out.println(s);
			for(int i=1;i<=s;i++) {
				ac1 = (AccountClass)ois.readObject();
				System.out.println(ac1);
				hm.put(ac1.accountNumber,ac1);
			}
			System.out.println(hm);
			ois.close();
			fis.close();
			
		}
		
		catch(Exception e) {
			System.out.println(e);
			
		}
		
		FileOutputStream fos = new FileOutputStream("E:/Practise/StudentChallenge1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		do {
			System.out.println("\n\nWelcome to Bank Bille");
			System.out.println("---------------------\n");
			
			System.out.println("1. Create Account");
			System.out.println("2. Delete Account");
			System.out.println("3. View Account");
			System.out.println("4. View All Account");
			System.out.println("5. Save Account");
			System.out.println("6. Exit\n");
			
			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();
			sc.nextLine();

			switch(choice) {
					case 1: 
						System.out.println("Enter Your name: ");
						String name = sc.nextLine();
						System.out.println("Enter Account Number: ");
						String accountNum = sc.nextLine();
						System.out.println("Enter your balance: ");
						double bal = sc.nextDouble();
						AccountClass a = new AccountClass(accountNum, name, bal);
						String account = a.accountNumber;
						hm.put(account, a);
							break;
					
					case 2: 
							System.out.println("Enter Account Number : ");
							ac = sc.nextLine();
							if (hm.containsKey(ac))
								System.out.println(hm.remove(ac));	
								
							else {
								System.out.println("Account number not present");								
							}
							break;
							
							
					case 3: 
							System.out.println("Enter Account Number : ");
							ac = sc.nextLine();
							System.out.println(hm.get(ac));
							break;
							
					case 4: 
							System.out.println("Viewing ALL Account");
							for(AccountClass acl:hm.values())
								System.out.println(acl);
							break;
							
					case 5: 					
							
							
					case 6: System.out.println("Save Account");
							System.out.println(hm.size());
							oos.write(hm.size());
							for(AccountClass acs1: hm.values())
								oos.writeObject(acs1);	
					
					}
			}while(choice!=6);
		
			oos.flush();
			oos.close();
			fos.close();
		
		
		

	}

}
