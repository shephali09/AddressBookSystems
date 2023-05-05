package com.bridgelabz.addressbooksystems;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book Program!");

		AddressBook addressbook = new AddressBook();

		System.out.println("\n1.Add contact\n2.Show Contact\n3.Edit Contact\n4.Exit\n");
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
				System.out.println("Program terminated successfully");
				break;
			default:
				System.out.println("Enter Correct choice!");

			}
			System.out.println("\n1.Add contact\n2.Show Contact\n3.Edit Contact\n0.Exit\n");
			choice = scanner.nextInt();
		}
		System.out.println("Good Bye to Address Book Program");

	}

}
