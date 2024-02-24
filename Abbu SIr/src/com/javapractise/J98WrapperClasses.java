package com.javapractise;

public class J98WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i = Integer.valueOf(1);
//		System.out.println(i);
		Integer b = 10;
		
		Byte bb = 15;
		Byte bc = Byte.valueOf(bb);
		
		//Auto Boxing : Automatically converting premitive values into Objects
		Byte b1 = 12;
		Short s1 = 10;
		
		Long l1 = 124l;
		Float f1 = 15.2f;
		Double d = 12.3;
		
		//Boxing/Wrapping: Converting from premitive values to objects
		Byte b2 = Byte.valueOf("12");
		// Byte b2 = Byte.valueOf(12) -> This raises error because cannot convert from integer to a byte
		//But we can directly provide byte value just by assigning to a byte
		byte b3 = 12;
		Byte b4 = Byte.valueOf(b3);//We can provide byte data but not an  Integer
		
		
		//Auto UnBoxing/Auto UnWrapping: Converting from objects to premitives
		byte aub1 = b2;//Same for remaining
		
		
		//UnBoxing
		byte ub1 = Byte.valueOf("12"); 
		byte ub2 = b4.byteValue();
		Integer i1 = 1;
		Integer i2 = 10;
		System.out.println(i1.compareTo(i2));;
				//b2.byteValue();
		
		
		
		
		
		
				
				
				
				
				
				
				

	}

}
