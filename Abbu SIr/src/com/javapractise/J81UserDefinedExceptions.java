package com.javapractise;

class LowBalanceException extends Exception{
	public String toString() {
		return "Minimum Balance reached ";
	}
}

public class J81UserDefinedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throw new LowBalanceException();
		}
		catch(LowBalanceException e){
			System.out.println(e);
			
		}
		

	}

}
