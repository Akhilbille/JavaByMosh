package com.javapractise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J125StudentChallenge1 {

	public static void main(String[] args)throws Exception {
		//Serialization
//		float f[] = {12.2f,3.6f,1.8f,2.97f};
//		int len =f.length;
//		
//		FileOutputStream fos = new FileOutputStream("E:/Practise/FloatNumbers.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
//		dos.writeInt(len);
//		for(float f1: f ) {
//			dos.writeFloat(f1);
//		}
//		
//		dos.close();
//		fos.close();
		
		//De-serialization
		FileInputStream fis = new FileInputStream("E:/Practise/FloatNumbers.txt");
		DataInputStream dis = new DataInputStream(fis);
		int len = dis.readInt();
		System.out.println(len);
		for (int i = 1; i<len;i++) {
			System.out.println(dis.readFloat());
		}
		dis.close();
		fis.close();
		

	}

}
