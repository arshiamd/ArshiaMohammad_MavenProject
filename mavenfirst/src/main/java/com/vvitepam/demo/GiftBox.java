package com.vvitepam.demo;

import java.util.ArrayList;

public class GiftBox{
	
	ArrayList<Gift> gifts = new ArrayList<Gift>();
	public static int totalPrice = 0;
	public static int chocCount = 0;
	public static int sweetCount = 0;
	public void addGift(String type,String selectedChoc, int selectedChocPrice) {
		// TODO Auto-generated method stub
		gifts.add(new Gift(type,selectedChoc,selectedChocPrice));
		totalPrice += selectedChocPrice;
		if(type.equalsIgnoreCase("chocolate"))
			chocCount += 1;
		else
			sweetCount += 1;
		
	}

	public void giftBoxWeight() {
		// TODO Auto-generated method stub
		System.out.println("\nCurrent Gift Box Weight : "+String.valueOf(totalPrice)+"/-\n");
	}

	
	public void displayGiftBox() {
		// TODO Auto-generated method stub
		if(totalPrice > 0) {
			System.out.println("\nYour Gift Box contains : \n");
			if(chocCount > 0) {
				System.out.println("\n\nChocolates are : \n");
				for(int i=0;i<gifts.size();i++) {
					if(gifts.get(i).type.equals("Chocolate")){
						System.out.println(gifts.get(i).name + "------>" + gifts.get(i).price+"/-");
					}
				}
			}
			
			if(sweetCount > 0) {
				System.out.println("\n\nSweets are : \n");
				for(int i=0;i<gifts.size();i++) {
					if(gifts.get(i).type.equals("Sweet")){
						System.out.println(gifts.get(i).name + "------>" + gifts.get(i).price+"/-");
					}
				}
			}
			
			System.out.println("\nTotal weight of the GiftBox is : " + totalPrice + "/-\n");
		}
		else
			System.out.println("\nYour Giftbox looks Empty!\n");
		
	}

	
	

}
