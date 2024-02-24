package com.javapractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class J114Copying2filesinto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis = new FileInputStream("E:/Practise/source1.txt");
			FileInputStream fis1 = new FileInputStream("E:/Practise/source2.txt");
			FileOutputStream fos = new FileOutputStream("E:/Practise/destination.java");
			SequenceInputStream sis = new SequenceInputStream(fis,fis1);
			
			int b;
			while((b = sis.read())!= -1)
				fos.write(b);
				


			
			System.out.println("Mission Passed");
			
			sis.close();
			fis.close();
			fos.close();
			fis1.close();
		}
		
		catch(FileNotFoundException e) {
			System.out.println("NOt found");
		}
		catch(IOException e) {
			System.out.println("IO");
		}
		

	}

}
