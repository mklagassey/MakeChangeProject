package com.skilldistillery;

import java.util.Scanner;

public class CashRegister {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double itemPrice = getItemPrice();
		double amtTendered = getAmtTendered();
		int itemPriceInt = changeDblToInt(itemPrice);
		int amtTenderedInt = changeDblToInt(amtTendered);

		if (itemPriceInt == amtTenderedInt) {
			exactChangeMsg();
		} else {
			moneyOwedMsg(itemPriceInt, amtTenderedInt);
		}
	}

	public static double getItemPrice() {
		System.out.println("Enter Item Price: ");
		double itemPrice = input.nextDouble();
		return itemPrice;

	}

	public static double getAmtTendered() {
		System.out.println("Enter amount tendered: ");
		double amtTendered = input.nextDouble();
		return amtTendered;
	}

	public static void exactChangeMsg() {
		System.out.println("Thank you for your business!");

	}

	public static void moneyOwedMsg(int price, int cash) {
		System.out.println("Someone owes money!");
		if (price > cash) {
			String custerOwes = "" + ((double)(price - cash)/100);
			System.out.println("Customer is short: $" + custerOwes);
		} else {
			double change = (cash - price);
			while (change > 0) {

			}
		}
	}

	public static int changeDblToInt(double dubIn) {
		int intOut = (int)(dubIn * 100);
		return intOut;
	}

}
