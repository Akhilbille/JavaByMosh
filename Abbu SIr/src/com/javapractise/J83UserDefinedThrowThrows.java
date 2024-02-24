package com.javapractise;

class NegativeDimensionException extends Exception{
	
	public  String toString(){
		return "Please provide positive numbers";
		
	}
	
}

public class J83UserDefinedThrowThrows {
	
	static int area(int l, int b)throws NegativeDimensionException {
		if (l < 0 || b < 0) {
			throw new NegativeDimensionException();
		}
		
		return l*b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		System.out.println(area(10,-1));
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
