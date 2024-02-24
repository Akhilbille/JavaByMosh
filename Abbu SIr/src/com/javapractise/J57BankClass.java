package com.javapractise;

class Account{
	private int accountNumber;
	private String customerName;
	private int phoneNumber;
	private String address;
	private String email;
	private int balance;
	private String dateOfBirth;
	
	public Account(int accountNumber, String name, int number,String address,
			String email,int balance,String dob) {
		this.accountNumber = accountNumber;
		this.customerName = name;
		this.phoneNumber = number;
		this.address = address;
		this.email = email;
		this.balance = balance;
		this.dateOfBirth = dob;
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getcustomerName() {
		return customerName;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}

class SavingsAccount extends Account{
	
	public SavingsAccount(int accountNumber, String name, int number,String address,
			String email,int balance,String dob){
		super(accountNumber,  name,  number, address, email, balance, dob);
		
		
	}
	
	private int fixedDepositAmount;
	
	
	
	
	public int getFixedDepositAmount() {
		return fixedDepositAmount;
	}
	
	public void setFixedDepositAmount(int amount) {
		this.fixedDepositAmount +=amount;
	}
	
	public void liquidate(int amount) {
		this.fixedDepositAmount -= amount;
	}
	
	
	
	public void deposit(int amount) {
		int balance = this.getBalance()+ amount;
		this.setBalance(balance);
		
	}
	
	public void withDraw(int amount) {
		int balance = this.getBalance() - amount;
		this.setBalance(balance);
	}
	
	public String toString() {
		return ("Account Number : " + this.getAccountNumber()+ "\n"+
				"Name : " + this.getcustomerName()+ "\n"+
				"Phone Number : " + this.getPhoneNumber()+ "\n"+
				"Email : " + this.getEmail()+ "\n"+
				"Address : " + this.getAddress()+ "\n"+
				"Date OF Birth : " + this.getDateOfBirth()+ "\n"+
				"Balance : " + this.getBalance()
				
				);
	}
	
	
	
}

public class J57BankClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount obj1 = new SavingsAccount(123456, "Akhil", 2035071959 ,
								"RRI","akhil@gmail.com" , 100000, "28-06-2000");
		System.out.println(obj1);
		obj1.deposit(200);
		System.out.println(obj1);
		obj1.withDraw(250);
		System.out.println(obj1);

	}

}
