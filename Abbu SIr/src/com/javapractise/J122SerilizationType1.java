package com.javapractise;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Students{
	
	int rollNumber;
	String name;
	String dept;
	
}

public class J122SerilizationType1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Students s1 = new Students();
		s1.rollNumber = 123;
		s1.name = "Akhil";
		s1.dept = "ECE";
		
		//Serialization
		FileOutputStream fos = new FileOutputStream("E:/Practise/student.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println(s1.rollNumber);
		ps.println(s1.name);
		ps.println(s1.dept);
		fos.close();
		ps.close();
		
		//De-serialization
//		public static void main(String[] args) throws Exception {
//		FileInputStream fis = new FileInputStream("E:/Practise/student.txt");
//		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
		
		
		
		
		
		
		
		
		

	}

}
