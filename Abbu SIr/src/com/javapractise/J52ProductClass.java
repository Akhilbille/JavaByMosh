package com.javapractise;

class Product{
	private int itemNumber;
	private String productName;
	private double itemPrice;
	private int itemQuantity;
	
	public Product(int itmNum, String pName) {
		itemNumber = itmNum;
		productName = pName;
		
	}
	public Product(int itmNum, String name, double price,int quantity) {
		itemNumber = itmNum;
		productName = name;
		itemPrice = price;
		itemQuantity = quantity;
	}
	public int getitemNumber() {
		return itemNumber;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getItemPrice() {
		return itemPrice;
	}
	
	public int getItemQuantity() {
		return itemQuantity;
	}
	
	public void  setItemPrice(int price) {
		itemPrice = price;
	}
	
	
	public void setItemQuantity(int quantity) {
		itemQuantity = quantity;
	}
	
	
	String itemDetails() {
		return ("Item Number : "+ itemNumber +"\n" + "Product Name : "+ productName +"\n" + "Item Price : "+ itemPrice +"\n" +
				"Quantity  : "+ itemQuantity +"\n");
	}
}

public class J52ProductClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product obj1 = new Product(1,"Mango",3.6,40);
		Product obj2 = new Product(2, "Apple", 2.34, 20);
		System.out.println(obj2.itemDetails());
		System.out.println(obj1.itemDetails());
		
		
		
		
		
		

	}

}
