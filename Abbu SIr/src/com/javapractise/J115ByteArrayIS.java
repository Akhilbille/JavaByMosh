package com.javapractise;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class J115ByteArrayIS {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		byte b[] = {'a','b','c','d'};
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		//Reading bytes one by one
//		int x;
//		while((x=bis.read())!=-1) {
//			System.out.println((char)x);
//		}
		
		String str = new String(bis.readAllBytes());
		System.out.println(str);
		bis.close();
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
		bos.write(b);
		byte bo[] = (bos.toByteArray());
		bos.close();
		for (byte b2: bo) {
			System.out.print((char)b2);
		}

	}

}
