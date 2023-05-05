package com.bridgelabz.addressbooksystems;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

}
