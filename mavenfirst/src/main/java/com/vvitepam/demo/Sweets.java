package com.vvitepam.demo;

import java.util.ArrayList;

public class Sweets implements GiftItem{
	
	ArrayList<SweetItems> sweetList = new ArrayList<SweetItems>();
	Sweets(){
		sweetList.add(new SweetItems("Laddu",30));
		sweetList.add(new SweetItems("GulabJamun",80));
		sweetList.add(new SweetItems("Rasagulla",50));
	}
	
	@Override
	public void displayItems(int lowlimit, int highlimit) {
		// TODO Auto-generated method stub
		for(int i=0;i<sweetList.size();i++) {
			if(sweetList.get(i).sweetPrice <= highlimit && sweetList.get(i).sweetPrice >= lowlimit ) {
				System.out.println(sweetList.get(i).sweetName+"----->"+String.valueOf(sweetList.get(i).sweetPrice)+"/-\n");
			}
		}
		
	}

	@Override
	public int getPrice(String selectedSweet, int lowlimit, int highlimit){
		// TODO Auto-generated method stub
		for(int i=0;i<sweetList.size();i++) {
			if(sweetList.get(i).sweetName.equalsIgnoreCase(selectedSweet) && (sweetList.get(i).sweetPrice <= highlimit && sweetList.get(i).sweetPrice >= lowlimit )) {
				return sweetList.get(i).sweetPrice;
						
			}
			else if(sweetList.get(i).sweetName.equalsIgnoreCase(selectedSweet) && !(sweetList.get(i).sweetPrice <= highlimit && sweetList.get(i).sweetPrice >= lowlimit )) {
				System.out.println(selectedSweet+" is Not in range");
				return 0;
			}
		}	
		System.out.println("\n" + selectedSweet+" is invalid selection\n");
		return 0;
		
	}
}