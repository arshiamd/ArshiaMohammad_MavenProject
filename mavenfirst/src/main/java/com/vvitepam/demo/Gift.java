package com.vvitepam.demo;

public class Gift {
	String type;
	String name;
	int price;
	
	Gift(String type,String name,int price){
		this.type = type;
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
}
