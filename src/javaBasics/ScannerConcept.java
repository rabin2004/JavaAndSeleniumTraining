package javaBasics;

import java.util.Scanner;

public class ScannerConcept {

	public static void main(String[] args) {

		/*Scanner obj = new Scanner(System.in);
		String userName;
		String pwd;
		int accountNumber;
		
		System.out.println("Enter username:");
		userName = obj.nextLine();
		System.out.println("Password:");
		pwd = obj.nextLine();
		System.out.println("Account number:");
		accountNumber = obj.nextInt();
		
		System.out.println("Username is " +userName);
		System.out.println("Password is " +pwd);
		System.out.println("Account number is " +accountNumber); */
		
		/*System.out.println("######Enter your informations:######");
		try (Scanner studentInfo = new Scanner (System.in)) {
			String first_name;
			String last_name;
			String dob;
			String address;
			String email_address;
			float phone_number;
			
			System.out.println("First Name: ");
			first_name = studentInfo.nextLine();
			
			System.out.println("Last Name: ");
			last_name = studentInfo.nextLine();
			
			System.out.println("DOB: ");
			dob = studentInfo.nextLine();
			
			System.out.println("Address: ");
			address = studentInfo.nextLine();
			
			System.out.println("Email address: ");
			email_address = studentInfo.nextLine();
			
			System.out.println("Contact Number: ");
			phone_number = studentInfo.nextFloat();
			
			System.out.println(first_name +" "+"has entered information");
			System.out.println("--------------------------");
			System.out.println("Check if these information are correct - " + first_name +" "+ last_name +"|"+ 
					dob +"|"+ address +"|"+ email_address +"|"+ phone_number); */
		
		
			System.out.println("Login:");
			
			Scanner obj = new Scanner(System.in);
			
			String user_name;
			String password;
			
			System.out.println("Enter Username: ");
			user_name = obj.nextLine();
			
			System.out.println("Enter password: ");
			password = obj.nextLine();
			
			System.out.println("Welcome back! "+" "+ user_name);
			
		}

	}


