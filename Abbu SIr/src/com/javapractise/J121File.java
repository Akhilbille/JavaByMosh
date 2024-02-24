package com.javapractise;

import java.io.File;

public class J121File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("E:/Practise/source2.txt");
		File f1 = new File("E:/Practise");
		System.out.println(f1.isDirectory());
		System.out.println(f.isDirectory());
		String file[] = f1.list();
		for(String x: file) {
			System.out.println(x);
		}
		File files[] = f1.listFiles();
		for(File fs : files) {
			System.out.println(fs.getName());
			System.out.println(fs.getPath());
		}
		

	}

}
