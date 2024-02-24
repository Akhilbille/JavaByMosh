package com.javapractise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class J118BufferReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("E:/Practise/source2.txt");
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		
		FileWriter fw = new FileWriter("E:/Practise/source3.txt");
		BufferedWriter bw =new BufferedWriter(fw);
		bw.write("Hello Everyone Namasthey");
		bw.close();
		fw.close();
	}

}
