package com.javapractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;

public class J113StChlngCopyingFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("E:/Practise/source1.txt");
			String str = "Java \nTEST";
			fos.write(str.getBytes());
			fos.close();
			
			//Copying data from source1 to source2
			FileInputStream fr = new FileInputStream("E:/Practise/source1.txt");
			byte b[] =new byte[fr.available()];
			fr.read(b);
			
			//Pasting Data into the new File
			FileOutputStream fos1 = new FileOutputStream("E:/Practise/source2.txt");
			String str1 = new String(b);
			str1 = str1.toLowerCase();
			fos1.write(str1.getBytes());
			fos1.close();
			System.out.println("Mission Passed");
			
		}
		
		catch(FileNotFoundException e) {}
		catch(IOException e) {}

	}

}
