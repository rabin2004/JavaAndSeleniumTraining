package test;

import java.util.Scanner;

public class FormattingValues {
	static Scanner scan = new Scanner(System.in);
	
	public static String fullName() {
		System.out.println("First Name: ");
		String firstName = scan.next();
		System.out.println("Last Name: ");
		String lastName = scan.next();
		String firstLetterFirstName = firstName.substring(0, 1).toUpperCase();
		String convertedFirstName = firstLetterFirstName.concat(firstName.substring(1));
		String firstLetterLastName = lastName.substring(0, 1).toUpperCase();
		String convertedLastName = firstLetterLastName.concat(lastName.substring(1));
		String formattedName = convertedFirstName+" "+convertedLastName;
		return formattedName;
	}
	
	public static String dob() {
		System.out.println("DOB (MMDDYYYY): ");
		String inputDate = scan.next(); // MMDDYYYY
		StringBuilder sb = new StringBuilder(inputDate);
		
		CharSequence mm = sb.subSequence(0, 2);
		CharSequence dd = sb.subSequence(2, 4);
		CharSequence yyyy = sb.subSequence(4,8);
		CharSequence date = mm+"/"+dd+"/"+yyyy;
		return date.toString();
	}
	
	public static String ssn() { 
		System.out.println("SSN: ");
		String inputSNN = scan.next();
		StringBuilder sb = new StringBuilder(inputSNN);
		
//		CharSequence a = sb.subSequence(0, 3);
//		CharSequence b = sb.subSequence(3, 5);
		CharSequence c = sb.subSequence(5, 9);
//		CharSequence formattedSNN = a+"-"+b+"-"+c;
		CharSequence maskedSNN = "***-**-"+c;
		return maskedSNN.toString();
	}
	
	public static String phoneNumber() {
		System.out.println("Phone Number: ");
		String phoneNumber = scan.next();
		StringBuilder sb = new StringBuilder(phoneNumber);
		
		CharSequence a = sb.subSequence(0, 3); //(123)-457-8901
		CharSequence b = sb.subSequence(3, 6);
		CharSequence c = sb.subSequence(6, 10);
		CharSequence formattedPhoneNumber = "("+a+")"+"-"+b+"-"+c;
		return formattedPhoneNumber.toString();
	}
	
	public static void customerDetails() {
		String[] details = {fullName(),
							dob(),
							ssn(),
							phoneNumber()
							};
		for(String detail: details) {
			System.out.print(detail+"\t");
		}
	}
	
	public static void main(String[] args) {
		customerDetails();
		
	}

}
