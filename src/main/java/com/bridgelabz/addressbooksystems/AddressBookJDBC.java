package com.bridgelabz.addressbooksystems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AddressBookJDBC extends BaseClass {

	public void retrieveAddressBookData() throws SQLException {
		connection = setUpDatabase();
		Statement statement = connection.createStatement();
		String query = "select * from address_book";
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String firstName = resultSet.getString(2);
			String lastName = resultSet.getString(3);
			String type = resultSet.getString(4);
			String address = resultSet.getString(5);
			String city = resultSet.getString(6);
			String state = resultSet.getString(7);
			int zip = resultSet.getInt(8);
			long phoneNumber = resultSet.getLong(9);
			String email = resultSet.getString(10);
			System.out.println(id + " " + firstName + " " + lastName + " " + type + " " + address + " " + city + " "
					+ state + " " + zip + " " + phoneNumber + " " + email);
		}
		System.out.println("Retrieve all address book data");

	}

	public void updateAddressBookData() throws SQLException {
		connection = setUpDatabase();
		PreparedStatement statement = connection.prepareStatement("select * from address_book where id=?");

		System.out.println("Enter the id of the Contact you want to update: ");
		Scanner scanner = new Scanner(System.in);
		int contactID = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter First name you want to update: ");
		String newFirstName = scanner.nextLine();
		System.out.println("Enter last name you want to update: ");
		String newLastName = scanner.nextLine();
		System.out.println("Enter type you want to update: ");
		String newType = scanner.nextLine();
		System.out.println("Enter address you want to update: ");
		String newAddress = scanner.nextLine();
		System.out.println("Enter city you want to update: ");
		String newCity = scanner.nextLine();
		System.out.println("Enter state you want to update: ");
		String newState = scanner.nextLine();
		System.out.println("Enter zip you want to update: ");
		int newZip = scanner.nextInt();
		System.out.println("Enter phone number you want to update: ");
		long newPhoneNumber = scanner.nextLong();
		System.out.println("Enter email you want to update: ");
		String newEmail = scanner.next();

		String query = "update address_book set first_name=?,last_name=?,type=?,address=?,city=?,state=?,zip=?,phone_number=?,email=? where id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, newFirstName);
		preparedStatement.setString(2, newLastName);
		preparedStatement.setString(3, newType);
		preparedStatement.setString(4, newAddress);
		preparedStatement.setString(5, newCity);
		preparedStatement.setString(6, newState);
		preparedStatement.setInt(7, newZip);
		preparedStatement.setLong(8, newPhoneNumber);
		preparedStatement.setString(9, newEmail);
		preparedStatement.setInt(10, contactID);
		preparedStatement.execute();
		System.out.println("Record updated successfully");

	}

}
