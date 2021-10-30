package com.bl.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
	ArrayList<Contacts> arrayDetails = new ArrayList<Contacts>();
	Scanner sc = new Scanner(System.in);

	/**
	 * This method is used to add details to address book
	 */
	public void addDetails() {
		Contacts info = new Contacts();
		System.out.println("Enter the first name");
		info.setFirstName(sc.nextLine());
		System.out.println("Enter the last name");
		info.setLastName(sc.nextLine());
		System.out.println("Enter the address");
		info.setAddress(sc.nextLine());
		System.out.println("Enter the city");
		info.setCity(sc.nextLine());
		System.out.println("Enter the state");
		info.setState(sc.nextLine());
		System.out.println("Enter the email");
		info.setEmail(sc.nextLine());
		System.out.println("Enter the zip code");
		info.setZip(sc.nextInt());
		System.out.println("Enter the phone number");
		info.setPhoneNumber(sc.nextLong());
		arrayDetails.add(info);
		sc.close();
	}

	/**
	 * This method is used to display the added information
	 */
	public void display() {
		System.out.println(arrayDetails);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBookMain details = new AddressBookMain();
		details.addDetails();
		details.display();
	}
}