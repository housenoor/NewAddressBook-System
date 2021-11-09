package com.bl.addressbook;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class addressBookMain {
	public static Map<String, addressBook> addressBookHashMap = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	public void addDataToAddressBook() {
		String chooseContact, chooseCity;
		do {
			System.out.println("Enter the name of city");
			String cityForMap = sc.nextLine();
			addressBook addressBook = new addressBook(cityForMap);
			for (Map.Entry<String, addressBook> entry : addressBookHashMap.entrySet()) {
				if (entry.getKey().equals(cityForMap)) {
					addressBook = entry.getValue();
				}
			}
			addressBookHashMap.put(cityForMap, addressBook);
			do {
				System.out.println("Enter first name:");
				String firstName = sc.nextLine();
				System.out.println("Enter last name:");
				String lastName = sc.nextLine();
				System.out.println("Enter address City:");
				String address = sc.nextLine();
				System.out.println("Enter state name:");
				String state = sc.nextLine();
				System.out.println("Enter zip code:");
				String zipcode = sc.nextLine();
				System.out.println("Enter phone number:");
				String phoneNumber = sc.nextLine();
				System.out.println("Enter emailId number:");
				String email = sc.nextLine();
				contactDetails contact = new contactDetails(firstName, lastName, address, state, zipcode, phoneNumber,
						email);
				System.out.println("Contact added successfully!!");
				for (Map.Entry<String, addressBook> entry : addressBookHashMap.entrySet()) {
					if (entry.getKey().equalsIgnoreCase(cityForMap)) {
						entry.getValue().addContact(contact);
					}
				}
				System.out.println("Do you want to add contact again? Yes|No");
				chooseContact = sc.nextLine();
			} while (chooseContact.equals("yes"));
			System.out.println("Do you want to add another city Yes|No");
			chooseCity = sc.nextLine();
		} while (chooseCity.equals("yes"));
		System.out.println("ADDRESS BOOK :--->" + addressBookHashMap);
	}

	public static void main(String[] args) {
		System.out.println(" Welcome To AddressBook System ");
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println(
					"1. Add new contact" + "\n" + "2. Edit contact details" + "\n" + "3. Delete contact details" + "\n"
							+ "4. Show Contacts " + "\n" + "5. Exit" + "\n" + "Enter your choice:");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				new addressBookMain().addDataToAddressBook(); // Add Contact Details
				break;
			case 2:
				System.out.println("Enter the address book name (city)");
				String city = scanner.next();
				System.out.println("Enter First Name of the contact you want to edit");
				String checkName = scanner.next();
				for (Map.Entry<String, addressBook> entry : addressBookHashMap.entrySet()) {
					if (entry.getKey().equalsIgnoreCase(city)) {
						entry.getValue().editContact(checkName);
					} else {
						System.out.println("The" + city + " address book does not present.");
					}
				}
				break;
			case 3:
				System.out.println("Enter the address book name (city)");
				city = scanner.next();
				System.out.println("Enter First Name of the contact you want to delete");
				String checkName1 = scanner.next();
				for (Map.Entry<String, addressBook> entry : addressBookHashMap.entrySet()) {
					if (entry.getKey().equalsIgnoreCase(city)) {
						entry.getValue().deleteContact(checkName1);
					} else {
						System.out.println("The" + city + " address book does not exist.");
					}
				}
				break;
			case 4:
				System.out.println(Collections.singletonList(addressBookHashMap));
				for (Map.Entry<String, addressBook> entry : addressBookHashMap.entrySet()) {
					System.out.println(entry.getKey() + entry.getValue().getAddressBook());
				}
				break;
			}
		} while (choice != 5);
	}
}