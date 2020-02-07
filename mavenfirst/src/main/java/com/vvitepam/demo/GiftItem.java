package com.vvitepam.demo;

public interface GiftItem {
	public abstract void displayItems(int lowlimit, int highlimit);
	public abstract int getPrice(String selectedItem,int lowlimit,int highlimit);

}
