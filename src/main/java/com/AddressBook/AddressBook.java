package com.AddressBook;

import java.util.Scanner;

/**
 * @author BALU
 * Main Class of AddressBook
 */
public class AddressBook {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// Displaying Welcome Message
		System.out.println("Welcome to Address Book Program");
		// Creating an object of Class AddressBook
		AddressBookService addressBook = new AddressBookService();
		// Calling methods from class AddressBookRunner 
		boolean choice=true;
		while (choice) {
			System.out.println("\nChoose the option:\nPress '1' for Add\nPress '0' for Exit");
			int option=scan.nextInt();
			switch (option) {
			case 0: choice=false;
				System.out.println("Exited out of AddressBook");
				break;
			case 1: addressBook.addDetails();
				break;
			default: 
				System.out.println("Please enter valid input");
			}
		}
	}
}
