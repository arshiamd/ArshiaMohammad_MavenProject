package com.vvitepam.demo;
import java.util.ArrayList;
import java.util.Scanner;
public class Chocolates implements GiftItem{
	

	ArrayList<ChocolateItems> chocList = new ArrayList<ChocolateItems>();
	Chocolates(){
		chocList.add(new ChocolateItems("Snickers",30));
		chocList.add(new ChocolateItems("DairyMilk",80));
		chocList.add(new ChocolateItems("Munch",50));
	}
	@Override
	public void displayItems(int lowlimit, int highlimit) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<chocList.size();i++) {
			if(chocList.get(i).chocPrice <= highlimit && chocList.get(i).chocPrice >= lowlimit ) {
				System.out.println(chocList.get(i).chocName + "----"+ String.valueOf(chocList.get(i).chocPrice)+"/-\n");
			}
		}
		
	}
	@Override
	public int getPrice(String selectedChoc, int lowlimit, int highlimit) {
		// TODO Auto-generated method stub
		for(int i=0;i<chocList.size();i++) {
			if(chocList.get(i).chocName.equalsIgnoreCase(selectedChoc) && (chocList.get(i).chocPrice <= highlimit && chocList.get(i).chocPrice >= lowlimit )) {
				return chocList.get(i).chocPrice;
			}
			else if(chocList.get(i).chocName.equalsIgnoreCase(selectedChoc) && !(chocList.get(i).chocPrice <= highlimit && chocList.get(i).chocPrice >= lowlimit )) {
				System.out.println(selectedChoc + " is not in a given range");
				return 0;
			}
		}
		System.out.println("\n" + selectedChoc + " is invalid selection\n");
		return 0;
	}
		
	
}
