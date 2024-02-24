package com.javapractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class StudentClass implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int ID;
	String name;
	String dept;
	static int  total = 200;
	
	
	public StudentClass(){}	
	public StudentClass(int id,String name, String dept,int total) {
		this.ID = id;
		this.name = name;
		this.dept = dept;
		StudentClass.total = total;
		
	}
	
	public String toString() {
		return "Student Details \n"
				+"\nName : "+this.name
				+"\nID : "+this.ID
				+"\nDepartment : "+this.dept
				+"\nTOtal : "+StudentClass.total;
	}
}

public class J124SerilizableInterface {
//	Serializing
//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		
//		StudentClass s1 = new StudentClass(101,"AKhil","ECE",100);
//		StudentClass s2 = new StudentClass(102,"nIhil","ECE",100);
//		FileOutputStream fos= new FileOutputStream("E:/Practise/studentserial1.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(s1);
//		oos.writeObject(s2);
//		oos.close();		
//		System.out.println("Done");
//		
//
//	}
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("E:/Practise/studentserial1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		StudentClass s = (StudentClass)ois.readObject();
		StudentClass s1 = (StudentClass)ois.readObject();
		System.out.println(s);
		System.out.println(s1);
		ois.close();
		fis.close();
	}
	

}
