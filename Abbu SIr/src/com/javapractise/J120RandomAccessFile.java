package com.javapractise;

import java.io.RandomAccessFile;

public class J120RandomAccessFile {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		RandomAccessFile rf = new RandomAccessFile("E:/Practise/source1.txt","rw");
		System.out.println((char)rf.read());
		System.out.println((char)rf.read());
		rf.write('c');
		System.out.println((char)rf.read());
		rf.seek(0);
		System.out.println((char)rf.read());
		rf.seek(rf.getFilePointer()+8);
		System.out.println((char)rf.read());
		rf.seek(rf.getFilePointer()-1);
		System.out.println((char)rf.read());
		
		
		rf.close();

	}

}
