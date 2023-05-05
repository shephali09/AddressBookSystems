package com.bridgelabz.addressbooksystems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook extends Contacts {


	ArrayList<Contacts> contact = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	Contacts contacts = new Contacts();

	public void addContacts() {

		boolean addMoreContacts = true;
		while (addMoreContacts) {

			System.out.println("Enter First Name: ");
			String firstName = scanner.nextLine();
			contacts.setFirstName(firstName);

			System.out.println("Enter Last Name: ");
			String lastName = scanner.nextLine();
			contacts.setLastName(lastName);
			if (isContactExists(firstName, lastName)) {
				System.out.println("Contact with same name already exists!");
				continue;
			}

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

			System.out.println("Do you want to add another contact? (Y/N)");
			String choice = scanner.nextLine();
			addMoreContacts = choice.equalsIgnoreCase("Y");
		}
	}

	public boolean isContactExists(String firstName, String lastName) {
		for (Contacts contact : contact) {
			if (contact.getFirstName().equalsIgnoreCase(firstName)
					&& contact.getLastName().equalsIgnoreCase(lastName)) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Contacts> viewContactsByCity(String city) {
		ArrayList<Contacts> result = new ArrayList<>();
		for (int i = 0; i < contact.size(); i++) {

			if (contact.get(i).getCity().equalsIgnoreCase(city)) {
				System.out.println(result.add(contacts));

			}

		}
		if (result.isEmpty()) {
			System.out.println("No contact found in the given city");
		} else {
			System.out.println("Contacts in the city of " + city + ":");
			for (int i = 0; i < contact.size(); i++) {
				System.out.println("First Name: " + contacts.getFirstName() + " " + "Last Name: "
						+ contacts.getLastName() + " " + "Address: " + contacts.getCity() + " " + "State: "
						+ contacts.getState() + " " + "Email: " + contacts.getEmail() + " " + "Zip: "
						+ contacts.getZip() + " " + "Phone Number: " + contacts.getPhoneNumber());
			}
		}
		return result;
	}

	public ArrayList<Contacts> viewContactByState(String state) {
		ArrayList<Contacts> result = new ArrayList<>();
		for (int i = 0; i < contact.size(); i++) {
			if (contact.get(i).getState().equalsIgnoreCase(state)) {
				System.out.println(result.add(contacts));
			}
		}
		if (result.isEmpty()) {
			System.out.println("No Contact found in the given state");
		} else {
			System.out.println("Contacts in the state of " + state + ":");
			for (int i = 0; i < contact.size(); i++) {
				System.out.println("First Name: " + contacts.getFirstName() + " " + "Last Name: "
						+ contacts.getLastName() + " " + "Address: " + contacts.getCity() + " " + "State: "
						+ contacts.getState() + " " + "Email: " + contacts.getEmail() + " " + "Zip: "
						+ contacts.getZip() + " " + "Phone Number: " + contacts.getPhoneNumber());

			}
		}
		return result;
	}

	public void countByCity(String city) {
		long count = 0;
		long countByCity = contact.stream().filter(p -> p.getCity().equalsIgnoreCase(city)).count();
		for (Contacts contact : contact) {
			countByCity = countByCity + count;
		}
		System.out.println("Number of Contacts list by city: " + countByCity);
	}

	public void countByState(String state) {
		long count = 0;
		long countByState = contact.stream().filter(p -> p.getState().equalsIgnoreCase(state)).count();
		for (Contacts contact : contact) {
			countByState = countByState + count;
		}
		System.out.println("Number of Contacts list by State: " + countByState);
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
