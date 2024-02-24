package com.javapractise;

import java.io.FileInputStream;

public class J112FileInputStream {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis = new FileInputStream("E:/Practise/File.txt");
			byte b[] = new byte[fis.available()];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
			  
		}
		catch(Exception e) {
			
		}

	}

}
