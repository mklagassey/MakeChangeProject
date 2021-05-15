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

	// TODO - refactor into smaller methods
	public static void moneyOwedMsg(int price, int paid) {
		if (price > paid) {
			String customerOwes = "" + ((double) (price - paid) / 100);
			System.out.println("Customer is short: $" + customerOwes); // TODO - Format to standard $00.00 output
		} else {
			System.out.println("Amount to give customer in change: ");

			int change = (paid - price);
			int twenties = 0, tens = 0, fives = 0, singles = 0, quarters = 0, dimes = 0, nickels = 0, pennies = 0;
			while (change > 0) {
				if (change >= 2000) {
					change -= 2000;
					twenties++;
					continue;
				}
				if (change >= 1000) {
					change -= 1000;
					tens++;
					continue;
				}
				if (change >= 500) {
					change -= 500;
					fives++;
					continue;
				}
				if (change >= 100) {
					change -= 100;
					singles++;
					continue;
				}
				if (change >= 25) {
					change -= 25;
					quarters++;
					continue;
				}
				if (change >= 10) {
					change -= 10;
					dimes++;
					continue;
				}
				if (change >= 5) {
					change -= 5;
					nickels++;
					continue;
				}
				if (change >= 1) {
					change -= 1;
					pennies++;
					continue;
				} else {
					break;
				}
			}
			if (twenties > 0) {
				System.out.println("Twenties: " + twenties);
			}
			if (tens > 0) {
				System.out.println("Tens: " + tens);
			}
			if (fives > 0) {
				System.out.println("Fives: " + fives);
			}
			if (singles > 0) {
				System.out.println("Singles: " + singles);
			}
			if (quarters > 0) {
				System.out.println("Quarters: " + quarters);
			}
			if (dimes > 0) {
				System.out.println("Dimes: " + dimes);
			}
			if (nickels > 0) {
				System.out.println("Nickels: " + nickels);
			}
			if (pennies > 0) {
				System.out.println("Pennies: " + pennies);
			}

		}
	}

	public static int changeDblToInt(double dubIn) {
		int intOut = (int) (dubIn * 100);
		return intOut;
	}

}

















































// So I can move this code up and down on the screen