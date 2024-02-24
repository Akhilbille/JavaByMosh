package com.javapractise;

class Subject{
	private String subID;
	private String subName;
	private int subMaxMarks;
	private int subMarksObtain;
	
	public Subject(String ID, String name) {
		subID = ID;
		subName = name;
	}
	
	public Subject(String ID, String name,int maxMarks, int marksObtained ) {
		subID = ID;
		subName = name;
		subMaxMarks = maxMarks;
		subMarksObtain = marksObtained;
	}
	
	public String getSubID() {
		return subID;
	}
	
	public String getSubName() {
		return subName;
	}
	
	public int getSubMaxMarks() {
		return subMaxMarks;
	}
	
	public int getsubMarksObtain() {
		return subMarksObtain;
	}
	
	public void setsubMaxMarks(int marks) {
		subMaxMarks = marks;
	}
	
	public void setsubMarksObtained(int marksObtain) {
		subMarksObtain = marksObtain;
	}
	
	public String toString() {
		return ("Subject ID : "+ subID +"\n" + "Subject Name : "+ subName +"\n" + 
				"Subject Maximum Marks : "+ subMaxMarks +"\n" +
				"Subject Marks Obtained  : "+ subMarksObtain +"\n");
	}
	
	
	 
	
}

public class J54CollegeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subject maths = new Subject("1","Maths",100,95);
//		System.out.println(maths.subDetails());
		
		Subject subs[] = new Subject[3];
		subs[0] = new Subject("1","Physiscs",100,95);
		subs[1] = new Subject("1","Maths",100,95);
		subs[2] = new Subject("1","Biology",100,95);
		for (Subject x: subs) {
			System.out.println(x);
		}
	}

}
