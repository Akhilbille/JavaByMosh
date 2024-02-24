package com.javapractise;
import java.util.Date;

class StudentRollNumber{
	private String rollNumber;
	private static int count = 1;
	private String generateRollNumber() {
		Date d = new Date();
		String rn = "Univ"+"-"+ (d.getYear()+1900)+"-"+	count;
		count++;
		return rn;
		} 
	
	public StudentRollNumber() {
		// TODO Auto-generated constructor stub
		rollNumber = generateRollNumber();
	}
	
	public String getRollNumber() {
		return rollNumber;
	}
}

public class J78StudentChallengeStatic {
	
	public static void main(String[] args) {
		StudentRollNumber st1 = new StudentRollNumber();
		StudentRollNumber st2 = new StudentRollNumber();
		StudentRollNumber st3 = new StudentRollNumber();
		
		System.out.println(st1.getRollNumber());
		System.out.println(st2.getRollNumber());
		System.out.println(st3.getRollNumber());
		
	}

}
