package com.javapractise;

class Customer{
	private int custID;
	private String custName;
	private String custAddress;
	private String custPhoneNumber;
	
	public Customer(int ID, String name) {
		custID = ID;
		custName = name;
	}
	
	public Customer(int ID, String name,String phnNum,String address) {
		custID = ID;
		custName = name;
		custAddress = address;
		custPhoneNumber = phnNum;
	}
	
	public int getcustID() {
		return custID;
	}   
	
	public String custNamString() {
		return custName;
	}
	
	public String getCustAddress() {
		return custAddress;
	}
	
	public String getCustPhoneNumber() {
		return custPhoneNumber;
	}
	
	public void setCustPhoneNumber(String phnNum) {
		custPhoneNumber = phnNum;
	}
	
	public void setCustAddress(String address) {
		custAddress = address;
	}
	
	public String customerDetails() {
	return ("Customer ID : "+ custID +"\n" + "Customer Name : "+ custName +"\n" + 
			"Customer Phone Number : "+ custPhoneNumber +"\n" +
			"Customer Address  : "+ custAddress +"\n");
	}
}

public class J53CustomerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer akhil = new Customer(1,"Akhil","8688393058","18/1/637");
		System.out.println(akhil.customerDetails());

	}

}
