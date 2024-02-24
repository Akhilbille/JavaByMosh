package com.javapractise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J117BufferStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("E:/Practise/source1.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		bis.mark(6);
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		bis.reset();
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		bis.close();
		fis.close();
		
		FileOutputStream fos = new FileOutputStream("E:/Practise/source1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte b[] = {'a','b','c'};
		bos.write(b);
		bos.close();
		
		
		
		
		

	}

}
