package com.bridglab;

import java.util.Scanner;

public class AddressBook {
	
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		long phoneNumber;
		int zipNumber;
		
		public void details() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First Name");
			firstName = sc.next();
		
			System.out.println("Enter Last Name");
			lastName = sc.next();
			
			System.out.println("Enter Address");
			address = sc.next();
			
			System.out.println("Enter city Name");
			city = sc.next();
			
			System.out.println("Enter state Name");
			state = sc.next();
			
			System.out.println("Enter Phone number");
			phoneNumber = sc.nextLong();
			
			System.out.println("Enter zipCode number");
			zipNumber = sc.nextInt();
			
		}

		public void printDetails() {
			System.out.println("enter your FirstName:" + firstName);
			System.out.println("enter your Last Name:" + lastName);
			System.out.println("enter your Address:" + address);
			System.out.println("enter your city:" + city);
			System.out.println("enter your state:" + state);
			System.out.println("enter your PhoneNumber:" + phoneNumber);
			System.out.println("enter your zipNumber:"+ zipNumber);
			
		}
		public static void main(String[] args) {
	    System.out.println("welcome addresss book");
	    AddressBook ab = new AddressBook();
		ab.details();
		ab.printDetails();
		

	}
		
}