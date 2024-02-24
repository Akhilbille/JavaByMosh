package com.javapractise;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
public class J111FileOuputReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fop = new FileOutputStream("E:/Practise/File.txt");
			String str = "Hello World";
			fop.write(str.getBytes());
			String str2 = "Namasthey";
			byte b[] = str2.getBytes();
			for(byte x:b) {
				fop.write(x);
			}
			fop.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		

	}

}
