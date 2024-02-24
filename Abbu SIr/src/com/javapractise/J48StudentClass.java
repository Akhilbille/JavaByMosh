package com.javapractise;

class Student{
	int rollNo;
	int m1,m2,m3;
	String name,course;
	float total,average;
	char grade;
	float total() {
		total= m1+m2+m3;
		return total;
	}
	
	float average() {
		average = total()/3f;
		return average;
	}
	
	char grade() {
		if (average() > 60) return 'A';
		else return 'B';
	}
	
	public String toString() {
		System.out.println("Name       : " + name);
		System.out.println("ID         : " + rollNo);
		System.out.println("Course     : " + course);
		System.out.println("M1         : " + m1);
		System.out.println("M2         : " + m2);
		System.out.println("M3         : " + m3);
		System.out.println("Total      : " + total());
		System.out.println("Average    : " + average());
		System.out.println("Grade      : " + grade());
		return "Done";
	}
	
}

public class J48StudentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.rollNo = 121;
		obj.name = "Akhil";
		obj.course = "MS CS";
		obj.m1 = 91;
		obj.m2 = 80;
		obj.m3 = 0;
		System.out.println(obj.grade());
		System.out.println(obj.average());
//		obj.reportDisplay();
		System.out.println(obj);
		
		
		
		

	}

}
