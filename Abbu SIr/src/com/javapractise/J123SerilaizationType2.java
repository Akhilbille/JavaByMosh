package com.javapractise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class Students1{
	
	int rollNumber;
	String name;
	String dept;
	
}

public class J123SerilaizationType2 {
	
	//Serialization
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Students1 s1 = new Students1();
		s1.rollNumber = 123;
		s1.name = "Akhil";
		s1.dept = "ECE";
		
		//Serialization
		FileOutputStream fos = new FileOutputStream("E:/Practise/student1.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(s1.rollNumber);
		dos.writeUTF(s1.name);
		dos.writeUTF(s1.dept);
		dos.close();
		fos.close();
		
		//De-Serialization
//		public static void main(String[] args) throws Exception {
//		FileInputStream fis = new FileInputStream("E:/Practise/student1.txt");
//		DataInputStream dis = new DataInputStream(fis);
//		System.out.println(dis.readInt());
//		System.out.println(dis.readUTF());
//		System.out.println(dis.readUTF());
		
	
	}

}
