package com.bridgelabz.addressbooksystems;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book Program!");

		AddressBook addressbook = new AddressBook();

		System.out.println(
				"\n1.Add contact\n2.Show Contact\n3.Edit Contact\n4.Delete Contact\n5.Search By City\n6.Search By State\n7.Count By City\n8.Count By State\n9.Exit\n");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter choice");
		int choice = scanner.nextInt();

		while (choice != 0) {

			switch (choice) {

			case 1:
				addressbook.addContacts();
				break;
			case 2:
				addressbook.displayContacts();
				break;
			case 3:
				addressbook.editExistingContact();
				break;
			case 4:
				addressbook.deleteContact();
				break;
			case 5:
				System.out.println("Enter city: ");
				String city = scanner.next();
				addressbook.viewContactsByCity(city);
				break;
			case 6:
				System.out.println("Enter State: ");
				String state = scanner.next();
				addressbook.viewContactByState(state);
				break;
			case 7:
				System.out.println("Enter city: ");
				String cityName = scanner.next();
				addressbook.countByCity(cityName);
			case 8:
				System.out.println("Enter state: ");
				String stateName = scanner.next();
				addressbook.countByState(stateName);
			case 9:
				System.out.println("Program terminated successfully");
				break;

			default:
				System.out.println("Enter Correct choice!");

			}
			System.out.println(
					"\n1.Add contact\n2.Show Contact\n3.Edit Contact\n4.Delete Contact\n5.View By City\n6.View By State\n7.Count By City\n8.Count By State\n0.Exit\n");
			choice = scanner.nextInt();
		}

		System.out.println("Good Bye to Address Book Program");

	}
}
