package com.AddressBook;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AddressBookService {
	
	private static Scanner scanner = new Scanner(System.in);
	List<AddressBookData> personList = new ArrayList<AddressBookData>();
	
	/**
	 * Asks the user for details of the person and storing in person List 
	 */
	public void addDetails() {
		
		System.out.print("\nEnter First name : ");
		String firstName = scanner.nextLine();
		
		System.out.print("Enter Last name : ");
		String lastName = scanner.nextLine();
		
		System.out.print("Enter Address : ");
		String address = scanner.nextLine();
		
		System.out.print("Enter City name : ");
		String city = scanner.nextLine();
		
		System.out.print("Enter State name : ");
		String state = scanner.nextLine();
		
		System.out.print("Enter ZIP Code : ");
		long zip = scanner.nextLong();
		
		System.out.print("Enter Phone Number : ");
		long mobileNo = scanner.nextLong();
		
		System.out.print("Enter E-Mail ID : ");
		String email = scanner.nextLine();
		
		// Adding the details into list
		AddressBookData person = new AddressBookData(firstName, lastName, address, city, state, zip, mobileNo, email);
	    personList.add(person);
	    System.out.println("Contact added successfully");
	}

}
