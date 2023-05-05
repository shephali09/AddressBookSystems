package com.bridgelabz.addressbooksystems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook extends Contacts {

	List<Contacts> contact = new ArrayList<Contacts>();
	Scanner scanner = new Scanner(System.in);
	Contacts contacts = new Contacts();

	public void addContacts() {

		System.out.println("Enter First Name: ");
		String firstName = scanner.nextLine();
		contacts.setFirstName(firstName);

		System.out.println("Enter Last Name: ");
		String lastName = scanner.nextLine();
		contacts.setLastName(lastName);

		System.out.println("Enter Address: ");
		String address = scanner.nextLine();
		contacts.setAddress(address);

		System.out.println("Enter City: ");
		String city = scanner.nextLine();
		contacts.setCity(city);

		System.out.println("Enter State: ");
		String state = scanner.nextLine();
		contacts.setState(state);

		System.out.println("Enter Email: ");
		String email = scanner.nextLine();
		contacts.setEmail(email);

		System.out.println("Enter zip: ");
		int zip = scanner.nextInt();
		contacts.setZip(zip);

		System.out.println("Enter Phone Number: ");
		long phoneNumber = scanner.nextLong();
		contacts.setPhoneNumber(phoneNumber);

		contact.add(contacts);
		System.out.println("Person added successfully!");
	}

	public void displayContacts() {

		if (contact.isEmpty()) {
			System.out.println("Address book is empty");
		}
		System.out.println("Address book");
		for (Contacts contact : contact) {
			System.out.println(contact.getFirstName());
			System.out.println(contact.getLastName());
			System.out.println(contact.getAddress());
			System.out.println(contact.getCity());
			System.out.println(contact.getState());
			System.out.println(contact.getZip());
			System.out.println(contact.getEmail());
			System.out.println(contact.getPhoneNumber());

		}

	}

	public void editExistingContact() {

		System.out.println("Enter the first name of the person you want to edit.\n");

		String firstName = scanner.next();

		for (int i = 0; i < contact.size(); i++) {
			if (contact.get(i).getFirstName().equals(firstName)) {

				contact.get(i).setFirstName(firstName);

				System.out.println("Enter Last Name: ");
				String lastName = scanner.nextLine();
				contact.get(i).setLastName(lastName);

				System.out.println("Enter Address: ");
				String address = scanner.nextLine();
				contact.get(i).setAddress(address);

				System.out.println("Enter City: ");
				String city = scanner.nextLine();
				contact.get(i).setCity(city);

				System.out.println("Enter State: ");
				String state = scanner.nextLine();
				contact.get(i).setState(state);

				System.out.println("Enter Email: ");
				String email = scanner.nextLine();
				contact.get(i).setEmail(email);

				System.out.println("Enter zip: ");
				int zip = scanner.nextInt();
				contact.get(i).setZip(zip);

				System.out.println("Enter Phone Number: ");
				long phoneNumber = scanner.nextLong();
				contact.get(i).setPhoneNumber(phoneNumber);

				System.out.println("Person edited successfully");
			} else {
				System.out.println("Contact data not found");
			}

		}
	}

	public void deleteContact() {

		System.out.println("Enter the first name you want to delete.");
		String firstName = scanner.next();
		for (int i = 0; i < contact.size(); i++) {
			if (contact.get(i).getFirstName().equals(firstName)) {
				contact.remove(contact.get(i));
				System.out.println("Person deleted successfully");
			} else {
				System.out.println("Contact data not found");
			}
		}

	}

}
