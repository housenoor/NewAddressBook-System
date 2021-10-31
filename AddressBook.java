package com.bl.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

import com.bl.bridgelabz.ContactDetails;

public class AddressBook {
	Scanner sc = new Scanner(System.in);
	/*
	 * Declaring The Add Contact Method And Entering The Contact Details By Using
	 * Scanner Class And Printing The Contact Details Of Person
	 */

	ContactDetails person = new ContactDetails();
	ArrayList<ContactDetails> contactList = new ArrayList<>();

	public ContactDetails addContact() {
		System.out.println("Enter the details of the contact");
		{
			System.out.println("Enter First Name: ");
			String firstName = sc.nextLine();
			System.out.println("Enter last Name: ");
			String lastName = sc.nextLine();
			System.out.println("Enter your addressCity: ");
			String addressCity = sc.nextLine();
			System.out.println("Enter your state: ");
			String state = sc.nextLine();
			System.out.println("Enter your EMail ID: ");
			String email = sc.nextLine();
			System.out.println("Enter zip code : ");
			long zip = sc.nextLong();
			System.out.println("Enter phone number: ");
			long phoneNumber = sc.nextLong();
			contactList.add(new ContactDetails(firstName, lastName, addressCity, state, email, zip, phoneNumber));
			person.setFirstName(firstName);
			person.setLastName(lastName);
			person.setAddressCity(addressCity);
			person.setState(state);
			person.setEmail(email);
			person.setPhoneNum(phoneNumber);
			person.setZip(zip);
			System.out.println("The Details Of Contact Is : " + person);
			return person;
		}
	}

	/*
	 * Declaring The Edit Contact Method TO Edit The Details Of Contact The Details
	 * Of Contact Edit By Using FirstName If First Name Is Match The Contact Will
	 * Edit
	 */
	public void editContact() {
		System.out.println(" Enter the first name of the contact : ");
		String contactFirstName = sc.nextLine();
		if (contactList.isEmpty()) {
			System.out.println(" Contact List is Empty! ");
		} else {
			for (ContactDetails person : contactList) {
				String checkName = person.getFirstName();
				if (checkName.equalsIgnoreCase(contactFirstName)) {
					System.out.print("Enter New First Name: ");
					String firstName = sc.nextLine();
					System.out.print("Enter New Last Name: ");
					String lastName = sc.nextLine();
					System.out.print("Enter New AddressCity: ");
					String address = sc.nextLine();
					System.out.print("Enter New State: ");
					String state = sc.nextLine();
					System.out.print("Enter New Email Id: ");
					String email = sc.nextLine();
					System.out.print("Enter New Zip Code of area: ");
					long zip = sc.nextLong();
					System.out.print("Enter New Mobile Number: ");
					long phoneNumber = sc.nextLong();

					person.setFirstName(firstName);
					person.setLastName(lastName);
					person.setAddressCity(address);
					person.setState(state);
					person.setEmail(email);
					person.setZip(zip);
					person.setPhoneNum(phoneNumber);
					System.out.println("Contact List Updated! ");
				} else {
					System.out.println(" Name not found. Enter Valid Name");
				}
			}
		}
	}

	/*
	 * Declaring The Delete Contact Method TO Details The Details Of Contact The
	 * Details Of Contact Delete By Using FirstName
	 */
	public void deleteContact() {
		System.out.println("Enter the name of the contact to be deleted : ");
		String deleteName = sc.next();
		if (contactList.isEmpty()) {
			System.out.println("The AddressBook is Empty....!");
		} else {
			for (int i = 0; i < contactList.size(); i++) {
				String matcher = contactList.get(i).getFirstName();
				if (matcher.equalsIgnoreCase(deleteName)) {
					contactList.remove(i);
					System.out.println("Contact Deleted Successfully...");
				} else {
					System.out.println("Name Not Found");
				}
			}
		}
	}

	/*
	 * Declaring The Method Of ShowContact Display The HowMany Contacts Are Added
	 */
	public void showContact() {
		System.out.println("Total Number of Contacts : " + contactList.size());
		System.out.println("---------------------------------------------------");
		if (contactList.isEmpty()) {
			System.out.println("There are no contacts in the contact list");
		} else {
			System.out.println(contactList);
			System.out.println("\n---------------------------------------------");
		}
	}

	/*
	 * Declaring Get Menu Method
	 */
	public void getMenu() {
		boolean exit = false;
		do {
			System.out.println(
					"Choose the valid option \n1. Add Contacts \n2. Edit Contact \n3. Delete Contact \n4. View Contacts \n5. Exit ");
			int option = sc.nextInt();
			sc.nextLine();
			switch (option) {
			case 1:
				addContact();
				System.out.println(person);
				System.out.println("Contact added successfully....");
				break;
			case 2:
				editContact();
				System.out.println(person);
				System.out.println("Contact details updated successfully");
				break;
			case 3:
				deleteContact();
				break;
			case 4:
				showContact();
				break;
			case 5:
				exit = true;
				break;
			default:
				System.out.print("Enter the valid option!");
				break;
			}
		} while (!exit);
	}

	public static void addressBookOptions(AddressBook addressBook) {

	}

	public void searchByOptions() {
		// TODO Auto-generated method stub

	}
}