package test;

import java.util.ArrayList;
import java.util.Scanner;

public class CreditCardManipulation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lengthOfValidCCNumber = 16;
		
		System.out.print("Full name in Credit Card: ");
		String FullName = scan.next();
		System.out.print("Enter 16 digit Credit Card number: ");
		String creditCardNumber = scan.next();
		System.out.print("Expiration date: ");
		String expirationDate = scan.next();
		System.out.print("Security number at the back of the card: ");
		int securityNumber = scan.nextInt();
		scan.close();
		
		ArrayList<String> paymentInfo = new ArrayList<String>();
		paymentInfo.add(FullName);
		paymentInfo.add(creditCardNumber);
		paymentInfo.add(expirationDate);
		paymentInfo.add(String.valueOf(securityNumber));
		
		//Billing confirmation
			if(creditCardNumber.equals(paymentInfo.get(1))) {
				int numberOfIndexInCCnumber = creditCardNumber.length();
				System.out.println(numberOfIndexInCCnumber);
				if(numberOfIndexInCCnumber==lengthOfValidCCNumber) {
					String last4Digit = creditCardNumber.substring(11);
					String first12Digit = creditCardNumber.substring(0, 12);
					String maskedFirst12Digit = first12Digit.replaceAll(first12Digit, "************");
					System.out.println("Valid credit card number."+maskedFirst12Digit.concat(last4Digit));
				}
				else {
					System.out.println("Invalid credit card number.");
				}	
			}
			else {
				System.out.println("Credit card not in record. Please add credit card first.");
			}
		}
}
