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
		double number;
        do {
        	System.out.println("Enter Item Price: ");
            while (!input.hasNextDouble()) {
                String userInput = input.next();
                System.out.printf("\"%s\" is not a valid amount. Please enter price with format $xx.xx\n", userInput);
            }
            number = input.nextDouble();
        } while (number < 0);
		double itemPrice = number;
		return itemPrice;

	}
	

	public static double getAmtTendered() {
		double number;
        do {
        	System.out.println("Enter amount tendered: ");
            while (!input.hasNextDouble()) {
                String userInput = input.next();
                System.out.printf("\"%s\" is not a valid amount. Please enter cash tendered with format $xx.xx\n", userInput);
            }
            number = input.nextDouble();
        } while (number < 0);
		
		double amtTendered = number;
		return amtTendered;
	}

	public static void exactChangeMsg() {
		System.out.println("Thank you for your business, please come again!");
	}

	// TODO - refactor into smaller methods
	public static void moneyOwedMsg(int price, int paid) {
		while (price > paid) {
			double customerOwes = ((price - paid) * 0.01);
			System.out.printf("Customer is short: $ %.2f%n", customerOwes); 
			System.out.println("Please enter additional payment amount: "); // TODO - Validate input is only numeric, using same algorithm as getItemPrice
			paid += (int) (100 * (input.nextDouble()));
//				continue;	
		};

		if (price == paid) {
			exactChangeMsg();
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
				System.out.printf("Twenties: %2d%n", twenties);
			}
			if (tens > 0) {
				System.out.printf("Tens: %6d%n", tens);
			}
			if (fives > 0) {
				System.out.printf("Fives: %5d%n", fives);
			}
			if (singles > 0) {
				System.out.printf("Singles: %3d%n", singles);
			}
			if (quarters > 0) {
				System.out.printf("Quarters: %2d%n", quarters);
			}
			if (dimes > 0) {
				System.out.printf("Dimes: %5d%n", dimes);
			}
			if (nickels > 0) {
				System.out.printf("Nickels: %3d%n", nickels);
			}
			if (pennies > 0) {
				System.out.printf("Pennies: %3d%n", pennies);
			}

		}

	}

	public static int changeDblToInt(double dubIn) {
		int intOut = (int) (dubIn * 100);
		return intOut;
	}

}

// So I can move this code up and down on the screen