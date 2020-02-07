package com.vvitepam.demo;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;
public abstract class NewyearGift{
	public static GiftBox gift = new GiftBox();
	public static void main(String args[]) throws NumberFormatException, IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n-----Give away Newyear gift :)-----\n");
		System.out.println("Select the item to gift");
		while(true) {
			System.out.print("1. Chocolates\n2. Sweets\n3. Done Purchase\nEnter your choice : ");
			DataInputStream in = new DataInputStream(System.in);
            int choice = Integer.parseInt(in.readLine());
            int lowlimit,highlimit;
			switch(choice) {
				case 1:
					System.out.println("\n--- Chocolates are avialable in the price range of 20/- to 200/- ---\n");
					System.out.print("\nEnter the lowerlimit of the price: ");
					lowlimit = scan.nextInt();
					System.out.print("\nEnter the higherlimit of the price: ");
					highlimit = scan.nextInt();
					if ( (lowlimit < 20 && highlimit >200) || (lowlimit>=highlimit) || (lowlimit < 20 || highlimit >200)) {
						System.out.println("\nPrice is not in a specified range!\n");
						break;
					}
					Chocolates chocObj = new Chocolates();
					System.out.println("\nAvailable Chocolates are \n");
					chocObj.displayItems(lowlimit,highlimit);
					System.out.print("\nEnter the chocolate you want : ");
					String selectedChoc = scan.next();
					int selectedChocPrice = chocObj.getPrice(selectedChoc,lowlimit,highlimit);
					if(selectedChocPrice != 0) {
						gift.addGift("Chocolate",selectedChoc,selectedChocPrice);
						System.out.println("\n" + selectedChoc + " is added!\n");
						gift.giftBoxWeight();
					}
					break;
					
				case 2:
					System.out.println("\n--- Sweets are avialable in the price range of 20/- to 200/- ---\n");
					System.out.print("\nEnter the lowerlimit of the price: ");
					lowlimit = scan.nextInt();
					System.out.print("\nEnter the higherlimit of the price: ");
					highlimit = scan.nextInt();
					if ( (lowlimit < 20 && highlimit >200) || (lowlimit>=highlimit) || (lowlimit < 20 || highlimit >200)) {
						System.out.println("\nPrice is not in a specified range!\n");
						break;
					}
					Sweets sweetObj = new Sweets();
					System.out.println("\nAvailable Sweets are \n\n");
					sweetObj.displayItems(lowlimit,highlimit);
					System.out.print("\nEnter the Sweeet you want : ");
					String selectedSweet = scan.next();
					int selectedSweetPrice = sweetObj.getPrice(selectedSweet,lowlimit,highlimit);
					if(selectedSweetPrice != 0) {
						gift.addGift("Sweet",selectedSweet,selectedSweetPrice);
						System.out.println("\n" + selectedSweet + " is added!\n");
						gift.giftBoxWeight();
					}
					break;
				case 3:
					gift.displayGiftBox();
					return;
					
				}
			}
				
		}
	}	
