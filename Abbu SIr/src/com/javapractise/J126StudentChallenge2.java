package com.javapractise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class CustomersClass implements Serializable{
	/**
	 * 
	 */

	static int count= 1;
	String custID;
	String name;
	String phone;
	
	public CustomersClass() {}
	public CustomersClass(String name,String phone) {
		this.custID = "c"+ count;
		CustomersClass.count++;
		this.name = name;
		this.phone = phone;
	}
	public String toString() {
		return "Customer ID : "+this.custID+
				"Name : "+this.name+
				"Phone number :"+this.phone;
	}
	
}

public class J126StudentChallenge2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		CustomersClass list[] = new CustomersClass[5];
//		list[0]=new CustomersClass("Akhil","1234560");
//		list[1]=new CustomersClass("Deepu","1234561");
//		list[2]=new CustomersClass("Dinu","1234562");
//		list[3]=new CustomersClass("Padma","123453");
//		list[4]=new CustomersClass("Padma","1234534");
//	
//		FileOutputStream fio = new FileOutputStream("E:/Practise/Customers.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fio);
//		
//		oos.writeInt(list.length);
//		for(CustomersClass l : list) {
//			oos.writeObject(l);
//		}
//		oos.close();

		FileInputStream fis = new FileInputStream("E:/Practise/Customers.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		int len = ois.readInt();
		for(int i=1;i<len;i++) {
			CustomersClass c = (CustomersClass)ois.readObject();
			System.out.println(c);
			}
		ois.close();
		fis.close();

	}

}
