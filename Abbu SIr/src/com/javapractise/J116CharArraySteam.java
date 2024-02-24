package com.javapractise;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;

public class J116CharArraySteam {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		char b[] = {'a','b','c','d'};
		CharArrayReader car = new CharArrayReader(b);
		
		//Reading characters one by one
		int c;
		while((c=car.read())!=-1) {
			System.out.println((char)c);
		}
		CharArrayWriter caw = new CharArrayWriter(20);
		caw.write(b);
		char cw[] = caw.toCharArray();
		for(char ch: cw) {
			System.out.print(ch);
		}
	
	}
	}


