package com.javapractise;

public class J41PrimeOrNot {
	boolean isPrime(int num) {
		
		if (num == 1 || num==2) {
			return true;
		}
		
		else {
			for(int i = 2; i <= num/2; i++) {
				if (num % i == 0) {
					return false;
				}				
			}
			  
				return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		J41PrimeOrNot pon = new J41PrimeOrNot();
		if (pon.isPrime(num)) {
			System.out.println(num + " is Prime");
		}
		else {
			System.out.println(num + " is not a  Prime");
			
		}
		
		
		

	}

}
